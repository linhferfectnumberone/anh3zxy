package com.example.quizzz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class QuestionList {
    private static ArrayList<Question> geographyEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Ninh Bình thuộc miền Bắc Việt Nam", true),
                    new Question("Trên thế giới có 4 châu Đại Dương", false),
                    new Question("Nhật Bản nằm ở Châu Á", true),
                    new Question("Chiều dài đường bờ biển Việt Nam là 3350 km", true),
                    new Question("Thành phố Yakutsk là thành phố lạnh nhất thế giới", true)
            )
    );
    private static ArrayList<Question> geographyMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Vùng chịu ngập lụt nghiêm trọng nhất nước ta là vùng đồng bằng sông Hồng", true),
                    new Question("Biển Đông là thuộc vùng nhiệt đới ẩm gió mùa", true),
                    new Question("Vùng núi Tây Bắc nằm giữa hai hệ thống sông lớn là Sông Hồng và sông Mã", false),
                    new Question("Lãnh thổ Việt Nam là khối thống nhất và toàn vẹn, bao gồm vùng đất, vùng biển, vùng trời", true),
                    new Question("Lượng mưa trung bình năm của nước ta khoảng từ 1500 đến 2000mm", true)
            )
    );
    private static ArrayList<Question> geographyHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Các nước phát triển có GDP/người cao, đầu tư nước ngoài nhiều, chỉ số HDI cao.", true),
                    new Question("Đặc trưng của cuộc cách mạng khoa học và công nghệ hiện đại là sự xuất hiện và phát triển nhanh chóng - bùng nổ công nghệ cao.", true),
                    new Question("Vào cuối thế kỷ XX, đầu thế kỉ XXI, cách mạng khoa học và công nghệ hiện đại được tiến hành.", true),
                    new Question("Độ muối trung bình của nước biển là 45%", false),
                    new Question("Khoảng cách trung bình giữa Mặt Trời và Trái Đất xấp xỉ 149,6 triệu kilômét", true)
            )
    );
    private static ArrayList<Question> historyEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Thời các vua Hùng, nước ta lấy quốc hiệu là Văn Lang", true),
                    new Question("Thoại Ngọc Hầu là một công thần nhà Nguyễn, ông tên thật là Nguyễn Ngọc Thoại", false),
                    new Question("Tổng bí thư đầu tiên của Đảng là Trần Phú", true),
                    new Question("Bác Hồ đọc bản tuyên ngôn độc lập tại quảng trường Ba Đình vào ngày 2/9/1945", true),
                    new Question("Văn Lang là nhà nước đầu tiên của nước ta", true)
            )
    );
    private static ArrayList<Question> historyMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Ngày giải phóng miền Nam thống nhất đất nước là ngày 30/4/1975", true),
                    new Question("Bác Hồ ra đi tìm đường cứu nước tại Bến Nhà Rồng vào ngày 6/6/1911", false),
                    new Question("Mỹ ném bom hạt nhân tấn công Hiroshima vào ngày 6/8/1945", true),
                    new Question("Chiến tranh thế giới thứ 2 bắt đầu diễn ra và kết thúc vào năm 1939-1945", true),
                    new Question("Tổng thống Abraham Lincoln bị ám sát vào ngày 14/4/1965", false)
            )
    );
    private static ArrayList<Question> historyHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Bản đồ thế giới ra đời vào năm 1569", true),
                    new Question("Bức tường Berlin bị gỡ bỏ năm 9/11/1989", true),
                    new Question("Liên Xô tan rã vào ngày 26/12/1991", true),
                    new Question("Christopher Columbus tìm ra Châu Mĩ vào năm 1492", true),
                    new Question("Nhà Trần 3 lần đánh thắng quân Mông-Nguyên", true)
            )
    );
    private static ArrayList<Question> scienceEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("TNT là 1 loại thuốc nổ ", true),
                    new Question("Gạo không chứa tinh bột", false),
                    new Question("Axit dễ bị phân hủy là H2CO3", true),
                    new Question("Ta dùng than củi để loại bỏ mùi cơm khê", true),
                    new Question("Khí Hidro nhẹ nhất trong các khí", true)
            )
    );
    private static ArrayList<Question> scienceMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Khi đốt bếp than sẽ tạo ra CO2 và CO", true),
                    new Question("Quỳ tím là một bazo", false),
                    new Question("Mendeleev là người phát minh ra bảng tuần hoàn", true),
                    new Question("Cát thủy tinh thực chất là nguyên tố Silic", true),
                    new Question("Lipid là hợp chất hữu cơ không phân cực", true)
            )
    );
    private static ArrayList<Question> scienceHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Chất béo là trieste của glixerol với các axit béo", true),
                    new Question("Trong phân tử Lipid có chứa các gốc acid béo no và không no", true),
                    new Question("Chất béo không bão hoà thường được tìm thấy nhiều ở thực phẩm quả bơ", false),
                    new Question("Vai trò của chất béo trong cơ thể Là nguồn năng lượng giúp chuyển hoá cân bằng lượng đường và cholesterol trong cơ thể", false),
                    new Question("Mỡ tự nhiên là Các triglixerit của các axit béo khác nhau", true)
            )
    );
    private static ArrayList<Question> artEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Vincent van Gogh là một danh hoạ Hà Lan thuộc trường phái hậu ấn tượng", true),
                    new Question("Hoa lan là một trong nhiều tác phẩm hội họa về hoa của họa sĩ người Hà Lan Vincent van Gogh", false),
                    new Question("Leonardo di ser Piero da Vinci là một họa sĩ, nhà điêu khắc, kiến trúc sư, nhạc sĩ, bác sĩ, kỹ sư, nhà giải phẫu, nhà sáng tạo và triết học tự nhiên.", true),
                    new Question("Mona Lisa là tác phẩm của Leonardo di ser Piero da Vinci.", true),
                    new Question("Picasso là một họa sĩ và nhà điêu khắc người Tây Ban Nha", true)
            )
    );
    private static ArrayList<Question> artMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Những người ăn khoai là một trong những kiệt tác của danh họa người Hà Lan Vincent van Gogh", true),
                    new Question("Zeus trong Thần thoại Hy Lạp là chúa tể lãnh địa mặt đất", false),
                    new Question("Freya là nữ thần đại diện cho phép thuật và chiến tranh", true),
                    new Question("Trong thần thoại Hy Lạp, Heracles phải thực hiện 12 kỳ công ", true),
                    new Question("Quái vật Minotaur là quái vật trong thần thoại Hy Lạp", true)
            )
    );
    private static ArrayList<Question> artHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Trong Thần thoại Bắc Âu, người khổng lồ Loki bị vị thần Thần Heimdall đánh bại.", true),
                    new Question("Vị thần Ereshkigal trong nền văn minh Lưỡng Hà là vị thần của thiên đường", false),
                    new Question("Mười hai vị thần trên đỉnh Olympus là những vị thần chính trong điện thờ của người Hy Lạp, cai trị trên đỉnh Olympus.", true),
                    new Question("Thor là con trai của thần Odin và nữ thần Jord.", true),
                    new Question("Hoạ sĩ Ma-nê được coi là 'Ngọn đèn biển của hội hoạ mới'", true)
            )
    );

    private static ArrayList<Question> mathEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("2+2=4",true),
                    new Question("46+50=100",false),
                    new Question("10-9=1",true),
                    new Question("2x2 = 4",true),
                    new Question("20 : 5 = 4 ",true)
            )
    );
    private static ArrayList<Question> mathMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("20 x 40 = 800",true),
                    new Question("35 x 14 = 400",false),
                    new Question("11 x 19 = 209",true),
                    new Question("17 x 19 = 323",true),
                    new Question("23 x 33 = 759",true)
            )
    );
    private static ArrayList<Question> mathHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("456 : 12 = 38",true),
                    new Question("Góc lượng giác có số đo −3060∘ thì có số đo theo rađian là -17pi",true),
                    new Question("Góc có số đo 120∘ đổi sang rađian là 2pi/3",true),
                    new Question("Góc lượng giác có số đo π/12 thì có số đo theo độ là 16 độ",false),
                    new Question("Một đường tròn có bán kính R=10cm. Độ dài cung 40∘ trên đường tròn gần bằng 7cm",true)
            )
    );
    private static ArrayList<Question> literatureEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Văn học VN giai đoạn 30-45 nổi bật với xu hướng lãng mạn, trong đó tổ chức văn chương nổi bật nhất thời kì này được biết đến là Tự lực văn đoàn",true),
                    new Question("Xuân Diệu là người chịu ảnh hưởng phong trào Thơ Mới",true),
                    new Question("Vào giai đoạn này, có 2 luồng ý kiến trái chiều về quan niệm : nghệ thuật vị nghệ thuật và nghệ thuật vị nhân sinh",true),
                    new Question("Số đỏ được viết theo xu hướng châm biếm, đả kích",true),
                    new Question("Đời thừa là tác phảm của nhà văn Nam Cao",true)

            )
    );
    private static ArrayList<Question> literatureMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Truyện ngắn Anh phải sống là tác phẩm nổi tiếng của Khái Hưng",true),
                    new Question("Thạch Lam là thành viên của Tự Lực Văn Đoàn",true),
                    new Question("Hàn Mặc Tử là tác giả của tập thơ Gái quê",true),
                    new Question("Xuân Diệu đã từng có một truyện ngắn rất nổi tiếng, đó là Vội Vàng",false),
                    new Question("Hộ là nhân vật chính trong tác phẩm Tắt đèn của nhà văn Ngô Tất Tố",false)
            )
    );
    private static ArrayList<Question> literatureHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Kinh Dương Vương là thủy tổ dân tộc Việt",true),
                    new Question("Đức thánh Tản Viên là Mai An Tiêm",false),
                    new Question("Tản Viên Sơn Thánh đã giúp An Dương Vương xây thành Cổ Loa",false),
                    new Question("Vì câu nói Gieo nhân nào, gặt quả nấy mà Mai An Tiêm bị vua cha đày ra đảo hoang",false),
                    new Question("Lang Liêu là người con trai thứ 18 của Vua Hùng",true)
            )
    );

    public static ArrayList<Question> getQuestionList(String topicName, String level) {
        ArrayList<Question> questionList = new ArrayList<>();
        ArrayList<Integer> questionIndex = new ArrayList<>();
        Random rand = new Random();
        int range = 5;
        int randomNumber = rand.nextInt(range);
        questionIndex.add(randomNumber);
        for (int i=0; i<4; i++) {
            while (questionIndex.contains(randomNumber)) {
                randomNumber = rand.nextInt(range);
            }
            questionIndex.add(randomNumber);
        }
        if (topicName == "Địa lý") {
            if (level == "Dễ"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, geographyEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (level == "Trung bình") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, geographyMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, geographyHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else if (topicName == "Lịch sử") {
            if (level == "Dễ"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, historyEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (level == "Trung bình") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, historyMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, historyHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else if (topicName == "Khoa học") {
            if (level == "Dễ"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, scienceEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (level == "Trung bình") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, scienceMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, scienceHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else if (topicName == "Nghệ thuật"){
            if (level == "Dễ"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, artEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (level == "Trung bình") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, artMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, artHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else if (topicName == "Toán học"){
            if (level == "Dễ"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, mathEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (level == "Trung bình") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, mathMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, mathHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else {
            if (level == "Dễ"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, literatureEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (level == "Trung bình") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, literatureMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, literatureHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        return questionList;
    }
}

