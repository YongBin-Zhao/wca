package com.zyb.utils;


import java.util.HashMap;
import java.util.Map;

//翻译的工具类
public class Translation {

    //存放地区的中文
    public static Map<String, String> region = new HashMap<>();

    //存放洲的中文
    public static Map<String, String> continent = new HashMap<>();

    //存放项目的中文
    public static Map<String, String> events = new HashMap<>();


    static {
        region.put("Afghanistan","阿富汗");
        region.put("Albania","阿尔巴尼亚");
        region.put("Algeria","阿尔及利亚");
        region.put("Andorra","安道尔");
        region.put("Angola","安哥拉");
        region.put("Antigua and Barbuda","安提瓜岛和巴布达");
        region.put("Argentina","阿根廷");
        region.put("Armenia","亚美尼亚");
        region.put("Australia","澳大利亚");
        region.put("Austria","奥地利");
        region.put("Azerbaijan","阿塞拜疆");
        region.put("Bahamas","巴哈马群岛");
        region.put("Bahrain","巴林");
        region.put("Bangladesh","孟加拉国");
        region.put("Barbados","巴巴多斯");
        region.put("Belarus","白俄罗斯");
        region.put("Belgium","比利时");
        region.put("Belize","伯利兹");
        region.put("Benin","贝宁");
        region.put("Bhutan","不丹");
        region.put("Bolivia","玻利维亚");
        region.put("Bosnia and Herzegovina","波斯尼亚和黑塞哥维那");
        region.put("Botswana","博茨瓦纳");
        region.put("Brazil","巴西");
        region.put("Brunei","文莱");
        region.put("Bulgaria","保加利亚");
        region.put("Burkina Faso","布吉纳法索");
        region.put("Burundi","布隆迪");
        region.put("Cabo Verde","佛得角");
        region.put("Cambodia","柬埔寨");
        region.put("Cameroon","喀麦隆");
        region.put("Canada","加拿大");
        region.put("Central African Republic","中非共和国");
        region.put("Chad","乍得");
        region.put("Chile","智利");
        region.put("China","中国");
        region.put("Colombia","哥伦比亚");
        region.put("Comoros","科摩罗");
        region.put("Congo","刚果");
        region.put("Costa Rica","哥斯达黎加");
        region.put("Cote d_Ivoire","科特迪瓦");
        region.put("Croatia","克罗地亚");
        region.put("Cuba","古巴");
        region.put("Cyprus","塞浦路斯");
        region.put("Czech Republic","捷克共和国");
        region.put("Democratic People_s Republic of Korea","朝鲜民主主义人民共和国");
        region.put("Democratic Republic of the Congo","刚果民主共和国");
        region.put("Denmark","丹麦");
        region.put("Djibouti","吉布提");
        region.put("Dominica","多米尼加");
        region.put("Dominican Republic","多米尼加共和国");
        region.put("Ecuador","厄瓜多尔");
        region.put("Egypt","埃及");
        region.put("El Salvador","萨尔瓦多");
        region.put("Equatorial Guinea","赤道几内亚");
        region.put("Eritrea","厄立特里亚");
        region.put("Estonia","爱沙尼亚");
        region.put("Eswatini","Eswatini");
        region.put("Ethiopia","埃塞俄比亚");
        region.put("Federated States of Micronesia","密克罗尼西亚联邦");
        region.put("Fiji","斐济");
        region.put("Finland","芬兰");
        region.put("France","法国");
        region.put("Gabon","加蓬");
        region.put("Gambia","冈比亚");
        region.put("Georgia","乔治亚州");
        region.put("Germany","德国");
        region.put("Ghana","加纳");
        region.put("Greece","希腊");
        region.put("Grenada","格林纳达");
        region.put("Guatemala","危地马拉");
        region.put("Guinea","几内亚");
        region.put("Guinea Bissau","几内亚比绍");
        region.put("Guyana","圭亚那");
        region.put("Haiti","海地");
        region.put("Honduras","洪都拉斯");
        region.put("Hong Kong","香港");
        region.put("Hungary","匈牙利");
        region.put("Iceland","冰岛");
        region.put("India","印度");
        region.put("Indonesia","印尼");
        region.put("Iran","伊朗");
        region.put("Iraq","伊拉克");
        region.put("Ireland","爱尔兰");
        region.put("Israel","以色列");
        region.put("Italy","意大利");
        region.put("Jamaica","牙买加");
        region.put("Japan","日本");
        region.put("Jordan","约旦");
        region.put("Kazakhstan","哈萨克斯坦");
        region.put("Kenya","肯尼亚");
        region.put("Kiribati","基里巴斯");
        region.put("Korea","韩国");
        region.put("Kosovo","科索沃");
        region.put("Kuwait","科威特");
        region.put("Kyrgyzstan","吉尔吉斯斯坦");
        region.put("Laos","老挝");
        region.put("Latvia","拉脱维亚");
        region.put("Lebanon","黎巴嫩");
        region.put("Lesotho","莱索托");
        region.put("Liberia","利比里亚");
        region.put("Libya","利比亚");
        region.put("Liechtenstein","列支敦斯登");
        region.put("Lithuania","立陶宛");
        region.put("Luxembourg","卢森堡");
        region.put("Macau","澳门");
        region.put("Madagascar","马达加斯加");
        region.put("Malawi","马拉维");
        region.put("Malaysia","马来西亚");
        region.put("Maldives","马尔代夫");
        region.put("Mali","马里");
        region.put("Malta","马耳他");
        region.put("Marshall Islands","马绍尔群岛");
        region.put("Mauritania","毛利塔尼亚");
        region.put("Mauritius","毛里求斯");
        region.put("Mexico","墨西哥");
        region.put("Moldova","摩尔多瓦");
        region.put("Monaco","摩纳哥");
        region.put("Mongolia","蒙古");
        region.put("Montenegro","黑山共和国");
        region.put("Morocco","摩洛哥");
        region.put("Mozambique","莫桑比克");
        region.put("Myanmar","缅甸");
        region.put("Namibia","纳米比亚");
        region.put("Nauru","瑙鲁");
        region.put("Nepal","尼泊尔");
        region.put("Netherlands","荷兰");
        region.put("New Zealand","新西兰");
        region.put("Nicaragua","尼加拉瓜");
        region.put("Niger","尼日尔");
        region.put("Nigeria","尼日利亚");
        region.put("North Macedonia","北马其顿");
        region.put("Norway","挪威");
        region.put("Oman","阿曼");
        region.put("Pakistan","巴基斯坦");
        region.put("Palau","帕劳");
        region.put("Palestine","巴勒斯坦");
        region.put("Panama","巴拿马");
        region.put("Papua New Guinea","巴布新几内亚");
        region.put("Paraguay","巴拉圭");
        region.put("Peru","秘鲁");
        region.put("Philippines","菲律宾");
        region.put("Poland","波兰");
        region.put("Portugal","葡萄牙");
        region.put("Qatar","卡塔尔");
        region.put("Romania","罗马尼亚");
        region.put("Russia","俄罗斯");
        region.put("Rwanda","卢旺达");
        region.put("Saint Kitts and Nevis","圣基茨和尼维斯");
        region.put("Saint Lucia","圣卢西亚岛");
        region.put("Saint Vincent and the Grenadines","圣文森特和格林纳丁斯");
        region.put("Samoa","萨摩亚");
        region.put("San Marino","圣马力诺");
        region.put("Sao Tome and Principe","São Tomé和Príncipe");
        region.put("Saudi Arabia","沙特阿拉伯");
        region.put("Senegal","塞内加尔");
        region.put("Serbia","塞尔维亚");
        region.put("Seychelles","塞舌尔");
        region.put("Sierra Leone","塞拉利昂");
        region.put("Singapore","新加坡");
        region.put("Slovakia","斯洛伐克");
        region.put("Slovenia","斯洛文尼亚");
        region.put("Solomon Islands","所罗门群岛");
        region.put("Somalia","索马里");
        region.put("South Africa","南非");
        region.put("South Sudan","南苏丹");
        region.put("Spain","西班牙");
        region.put("Sri Lanka","斯里兰卡");
        region.put("Sudan","苏丹");
        region.put("Suriname","苏里南");
        region.put("Sweden","瑞典");
        region.put("Switzerland","瑞士");
        region.put("Syria","叙利亚");
        region.put("Taiwan","台湾");
        region.put("Tajikistan","塔吉克斯坦");
        region.put("Tanzania","坦桑尼亚");
        region.put("Thailand","泰国");
        region.put("Timor-Leste","东帝汶");
        region.put("Togo","多哥");
        region.put("Tonga","汤加");
        region.put("Trinidad and Tobago","特立尼达和多巴哥");
        region.put("Tunisia","突尼斯");
        region.put("Turkey","火鸡");
        region.put("Turkmenistan","土库曼斯坦");
        region.put("Tuvalu","图瓦卢");
        region.put("Uganda","乌干达");
        region.put("Ukraine","乌克兰");
        region.put("United Arab Emirates","阿拉伯联合酋长国");
        region.put("United Kingdom","联合王国");
        region.put("Uruguay","乌拉圭");
        region.put("USA","美国");
        region.put("Uzbekistan","乌兹别克斯坦");
        region.put("Vanuatu","瓦努阿图");
        region.put("Vatican City","梵蒂冈城");
        region.put("Venezuela","委内瑞拉");
        region.put("Vietnam","越南");
        region.put("XA","多个国家(亚洲)");
        region.put("XE","多个国家(欧洲)");
        region.put("XF","多个国家(非洲)");
        region.put("XM","多个国家(美洲)");
        region.put("XN","多个国家(北美)");
        region.put("XO","多个国家(大洋洲)");
        region.put("XS","多个国家(南美洲)");
        region.put("XW","多个国家(世界)");
        region.put("Yemen","也门");
        region.put("Zambia","赞比亚");
        region.put("Zimbabwe","津巴布韦");



        continent.put("Africa","非洲");
        continent.put("Asia","亚洲");
        continent.put("Europe","欧洲");
        continent.put("Multiple Continents","多个大洲");
        continent.put("North America","北美洲");
        continent.put("Oceania","大洋洲");
        continent.put("South America","南美洲");

        events.put("222","二阶");
        events.put("333","三阶");
        events.put("333bf","三盲");
        events.put("333fm","最少步");
        events.put("333ft","脚拧");
        events.put("333mbf","多盲");
        events.put("333mbo","旧规则多盲");
        events.put("333oh","单手");
        events.put("444","四阶");
        events.put("444bf","四盲");
        events.put("555","五阶");
        events.put("555bf","五盲");
        events.put("666","六阶");
        events.put("777","七阶");
        events.put("clock","魔表");
        events.put("magic","八板");
        events.put("minx","五魔");
        events.put("mmagic","十二板");
        events.put("pyram","金字塔");
        events.put("skewb","斜转");
        events.put("sq1","sq1");

    }


}

