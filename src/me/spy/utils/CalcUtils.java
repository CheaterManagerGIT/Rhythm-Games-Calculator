package me.spy.utils;

public class CalcUtils {

    public static float ctdCalc(float tp, float lv){

        float f = -1f;
        float rt;

        if(tp >= 0.0f && tp < 70.0f){
            f = (float) (Math.sqrt(tp) * 0.5);
        }else if(tp >= 70.0f && tp < 97.0f){
            f = (float) (0.7f - 0.2f * Math.log10((double) (100 - tp) / 3));
        }else if(tp >= 97.0f && tp < 99.7f){
            f = (float) (0.7f - 0.16f * Math.log10((double) (100 - tp) / 3));
        }else if(tp >= 99.7f && tp < 99.97f){
            f = (float) (0.78f - 0.08f * Math.log10((double) (100 - tp) / 3));
        }else if(tp >= 99.97f && tp <= 100f){
            f = 2f * tp - 199f;
        }

        if(f != -1f){
            rt = f * lv;
            return rt;
        }

        return -1f;

    }

    public static double arcCalc(int score, double lv){

        double f = -1;
        double ptt;

        if(score >= 10000000){
            f = 2;
        }else if(score < 10000000 && score >= 9800000){
            f = 1 + ((double)(score - 9800000) / 200000);
        }else if(score < 9800000 && score >= 0){
            f = 1 + ((double)(score - 9500000) / 300000);
        }

        if(f != -1){
            ptt = lv + f;
            if(ptt >= 0){
                return ptt;
            }else{
                return 0;
            }

        }

        return -1;

    }

}
