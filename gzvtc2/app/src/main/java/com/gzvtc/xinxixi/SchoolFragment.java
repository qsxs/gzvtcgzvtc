package com.gzvtc.xinxixi;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SchoolFragment extends Fragment {
    String jianjie = "\t广州工程技术职业学院是经广东省人民政府批准、国家教育部备案的广州市属普通高校，创办于1964年。\n\t学院以先进的教育理念、独特的办学思路、优秀的师资队伍、优雅的校园环境、鲜明的高职特色，致力于培养具有现代竞争意识和综合职业能力、素质全面，能适应二十一世纪经济发展需要的高素质的技术技能型人才。作为一所有着五十多年历史的公办高校，近年来，在不断的改革、超越和发展中打下了稳固的基础，积累了丰富的经验，逐步形成了知识、品格、才艺、技能四元并重的办学风格。以独特的思路和新颖的做法应对竞争，谋求突破，实现了跨越式发展，形成了 “万人学校，亿元资产 ” 的强劲格局，取得了良好的经济效益和社会效益。\n\t学院现设有机电工程系、信息工程系、石化工程系、财经与管理系、外语与商贸系、餐饮与旅游管理学院、艺术与设计学院、继续教育学院等8个系（院），在校高职生人数近8000人。外加三所附属中职学校和一个培训中心，组建了以高职教育为主体、以中职教育为两翼、以技能培训为拓展平台，在校学历生规模超1.6万人，年培训超3万人次的职业教育集团。\n\t学院办学紧贴广州及珠江三角洲地区经济社会发展的需要，实施专业错位发展和人才培养模式创新，培养“有教养、有本领”的高素质技术技能型人才。毕业生总体就业率连续六年位居全省本专科院校前三名，2013、2014、2015年均达100%。毕业生以良好的面貌、全面的素质和过硬的能力广受用人单位好评，用人单位的满意率达100%，其中优良率达96.4% ";
    String[] s = new String[]{
            "学院简介",
            "系院与课程",
            "专业建设",
            "招生资讯",
            "就业资讯",
            "人才培养"
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragemnt_scool, container, false);
        TextView tv = (TextView) view.findViewById(R.id.tv_select);
        final TextView body = (TextView) view.findViewById(R.id.tv_body);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(getContext())
                        .setAdapter(new ArrayAdapter<String>(getContext(),
                                android.R.layout.simple_list_item_1, s), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (which == 0) {
                                    body.setText(jianjie);
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    for (int i = 0; i < 50; i++) {
                                        sb.append(s[which]);
                                    }
                                    body.setText(sb.toString());
                                }
                            }
                        })
                        .show();
            }
        });
        return view;
    }
}
