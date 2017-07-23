package wu.jie.check;

/**
 * 校验验证码
 * @author Administrator
 */
public class CheckMsg {
    public static void main(String[] args) {
        String mobileNumber = "15216265283";//手机号码
        String code = "1071";//验证码
        try {
            String str = MobileMessageCheck.checkMsg(mobileNumber,code);
            if("success".equals(str)){
                System.out.println("验证成功！");
                System.out.println("通过申请！");
            }else{
                System.out.println("验证失败！");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}