package com.king.easychat.app.group

import com.king.easychat.bean.MessageBean
import com.king.easychat.bean.MessageNewBean

/**
 * Created by luoxiao on 2020/1/9.
 */
class DateUtil {


    companion object{

        var images = arrayOf("http://cms-bucket.ws.126.net/2020/0109/92a274e5p00q3twov000yc0009c005uc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/d1570955p00q3trxh003qc0008w006oc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/7259221fp00q3tvcw002hc0009c005uc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/b8d50543p00q3ttsk0039c0009c005uc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/9fc8cbe3p00q3tsqq003ac0009c005uc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/aaf86f67p00q3trkn003ic0009c005uc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/59cf3f89p00q3trjc01j2c000sg00lcc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/04058b3cp00q3tr7e006dc000p000dwc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/81121605p00q3tqz000hnc000k200d9c.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/c1d53d28p00q3tqbj003uc0009c005uc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/17abcf0fp00q3tqa3004wc000b4007cc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/08d06fc1p00q3tnfe001ac0009c005uc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/c79a35ffp00q3tfki004xc0008w006oc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/a14c4af8p00q3tlv20010c0009c005uc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/833293acp00q3tl65002kc0009c005uc.png?imageView&thumbnail=140y88",
            "http://cms-bucket.ws.126.net/2020/0109/bc2d71ccp00q3tjqt002hc0009c005uc.png?imageView&thumbnail=140y88")
        var content = arrayOf("昔日跌停王*ST信威 近期惹投资者注目。原因是公司前段时间发了一个很有意思的公告。这家公司宣布要在境外成立一个以投资5G为主的基金，总规模75亿美金，信威出资26亿美金。该基金的投资方向为：5G/4G、人工智能、云计算、大数据、区块链、物联共享时下最火概念一网打尽。随后经短期筑底后该公司股价在22天的交易时间内出现21个涨停板。\n" +
                "\n" +
                "1月9日，*ST信威高开后直线上涨，随后震荡下行股价跌停直至收盘，数据显示，*ST信威收报3.71元，跌5.12%\n" +
                "\n" +
                "值得注意的是从其被特别处理的*ST帽子投资者就知道这是个有很大风险的股票，它上涨的动力是什么？风险又存在哪些？\n" +
                "\n" +
                "数据显示，2019年11月7日该股股价最低下探至1.05元，当日公司发布公告称收到上交所关于*ST信威参与发起设立基金的问询函。之后便展开了筑底反弹的过程。\n" +
                "\n" +
                "本轮连续涨停自去年12月16日起，是该股的第三轮连续涨停过程。其曾披露的构成重大资产重组的参与发起设立5G基金事项似乎是大家共同认定的主要上涨动力。而这件事本身似乎并没有那么高的确定性。\n" +
                "\n" +
                "其在今年1月4日披露的公告提示了风险，其中之一就是发起设立5G基金风险。公司在公告中表示，公司参与发起设立基金尚未取得相关部门对外投资的批准，尚未取得公司债权人的书面同意和海外运营商原有股东的同意，所需履行的重大资产重组相关程序亦尚未完成，公司参与发起设立基金事项能否成功实施存在重大不确定性。\n" +
                "\n" +
                "此外，关于重大资产重组的风险。公司尚未取得乌克兰政府的反垄断审查批复，公司审计报告中无法表示意见所涉及事项尚未解决，尽职调查等相关工作尚未全面开展，交易对象及标的资产股份被冻结，后续工作亦存在一定不确定性，后续不排除终止或变更的可能性。\n" +
                "\n" +
                "再加上，因公司2017年度和2018年度经审计的归属于上市公司股东的净利润为负值，公司2018年度被致同会计师事务所（特殊普通合伙出具了无法表示意见的审计报告，公司股票被实施退市风险警示。\n" +
                "\n" +
                "上述风险对投资炒作该股的中小投资者形成了重大的不可控性，而近期*ST神城A股、B股终止上市也提醒投资者，参与濒临退市股的炒作风险极高。","受美伊局势缓消息刺激，沪深两市高开高走，两市仅400余只个股飘绿，创业板大涨2.7%，逼近2018年4月份高点，量子通信、数字中国、国产软件等科技板受到资金追捧，人气龙头星期六尾盘涨停，市场短线情绪高涨，但军工、黄金、原油等避险板块纷纷重挫。沪股通净流入41亿，深股通净流入54亿。\n" +
                "\n" +
                "截至收盘：沪指涨0.91%，报3094.88点；深指涨1.79%，报10898.17点；创业板指数涨2.71%，报1913.14点。\n" +
                "\n" +
                "板块方面：量子通信、国产软件、云计算等板块跌幅居前，中船系、黄金、国防军工等板块跌幅居前。\n" +
                "\n" +
                "外围情况：美国三大指数集体收涨，纳指再创收盘历史新高。美国大型科技股多数收涨，苹果涨1.6%，股价再次突破300美元关口，特斯拉涨近5%，再创收盘历史新高。热门中概股多数收涨，瑞幸咖啡涨超12%，蔚来汽车涨逾4%。亚太股市集体大涨，东京日经指数领涨。东京日经指数涨2.31%，报收23740点；台湾加权指数涨1.30%，报收11971点；韩国综合指数涨1.63%，报收2186点。\n" +
                "\n" +
                "消息面上：1、特朗普：美国将立即对伊朗施加额外的惩罚性经济制裁，不希望使用军事力量。2、国务院召开常务会议，要求全力做好市场保供稳价工作。3、深圳市政府工作报告：争取在创业板注册制改革等方面实施一批先行先试政策。4、农业农村部：2020年将继续安排项目资金用于支持新建、改扩建种猪场、规模猪场。5、商务部：进一步缩减外商投资负面清单，加快推进海南自贸港建设。6、据央视新闻，武汉不明原因的病毒性肺炎疫情病原体初步判定为新型冠状病毒。\n" +
                "\n" +
                "\n" +
                "神光财经观点：今日沪指震荡上行，大涨近0.9%，创指强势上涨，大涨超2.5%，成功站上1900点，再创年内新高，量子通信大涨，领涨两市，三力士等4股涨停，国产软件大涨，银之杰等10股涨停，带动云计算等板块走强，星期六再次涨停，创历史新高，机场航运板块大涨，涨幅居前，华夏航空大涨近7%，医疗器械服务板块大涨超2%，中珠医疗等3股涨停，5G概念也涨幅居前，安洁科技等两股涨停，中船系、黄金、军工、石油等板块大跌，跌幅居前。大盘经过多日上涨之后，目前来到3100点重要关口，虽然短期压力较大，但是市场投资热情已被激发，大家可以逢低买入优质股，耐心持股待涨。",
            "中国网财经1月9日讯(记者里豫 邓玉蕊)近日，上海锐奇工具股份有限公司(下称锐奇股份)被卷入前证监会发审委委员韩建旻的受贿一案。同时，锐奇在上市前后差距较大的业绩和近年来不断下滑的业绩，令投资者对锐奇股份的盈利能力产生了担忧。\n" +
                    "\n" +
                    "上市求通过 行贿前证监会创业板发审委委员\n" +
                    "\n" +
                    "据悉，从江县人民法院审理韩建旻犯受贿罪一案，一审已于2019年8月26日作出(2018)黔2633刑初91号刑事判决。\n" +
                    "\n" +
                    "判决书认定，被告人韩建旻受中国证券监督管理委员会聘任，在担任中国证券监督管理委员会第一、二、三创业板发行审核委员会专职委员期间，在审核拟上市公司的发行申请材料中，违反规定收受申请公司董事长或保荐机构人员的财物。收受贿赂折合人民币共计3437871.783元，数额特别巨大，其行为已构成受贿罪。\n" +
                    "\n" +
                    "判决书还披露了大量细节：2010年6月，上海锐奇董事长吴明厅在申请公司上市时，为保证顺利通过发审委的审核，将10万元人民币拿给券商高管曾某并让其帮忙送给发审委的委员，后曾某将10万元人民币送给韩建旻并让其帮忙。2010年9月9日，中国证券监督管理委员会批复上海锐奇公开发行股票并在创业板上市。\n" +
                    "\n" +
                    "对于该案件，专业律师向记者表示：根据《中华人民共和国刑法》第三百八十九条规定，行贿罪相关规定：为谋取不正当利益，给予国家工作人员以财物的，构成行贿罪。行贿人在被追诉前主动交待行贿行为的，可以从轻或者减轻处罚。其中，犯罪较轻的，对侦破重大案件起关键作用的，或者有重大立功表现的，可以减轻或者免除处罚。因此，具体犯罪认定和处罚，还需司法机关根据具体案情事实、具体情况予以认定。\n" +
                    "\n" +
                    "而对于该案件的相关情况，锐奇股份至今还未进行公告披露。\n" +
                    "\n" +
                    "上市前后业绩“变脸”\n" +
                    "\n" +
                    "资料显示，锐奇股份2010年上市。在其上市前后，业绩变化较为明显。2008-2010年间，锐奇股份实现营业收入2.78亿元、3.19亿元、4.18亿元，增长速度为14.75%、31.09%。归属于上市公司的股东的净利润为0.29亿元、0.43亿元、0.54亿元，增长速度为48.28%、27.30%。在2011年，锐奇股份仍然保持着增速，营业收入和净利润相比于2010年分别增长了35.21%、37.15%。\n" +
                    "\n" +
                    "但到了2012年，锐奇股份的业绩开始下滑。营业收入相比2011年下降了4.75%，净利润下降了29.34%，扣除经常性损益后的净利润则下降了32.88%。到了2013年，锐奇股份的营业利润仍然保持下滑曲线，下降比例达到16.59%，扣除经常性损益后的净利润则下降了12.72%。\n" +
                    "\n" +
                    "净利润逐年下滑 近年产生亏损\n" +
                    "\n" +
                    "而回到近年来的业绩上，锐奇股份的表现同样不容乐观。财报显示，2016年-2018年，锐奇股份的营业收入为5.27亿元、5.49亿元、5.83亿元。但归属于上市公司股东的净利润却惨遭滑铁卢，2016-2017年度，锐奇股份的净利润从624.79万元元下降至444.03万元，下降比例高达40.71%。\n" +
                    "\n" +
                    "到了2018年，这一数据范围继续扩大，净利润则直接变成负数，产生亏损。2018年财报显示，锐奇股份大亏4478.66万元，净利润下降幅度高达1,108.63%。不断下滑的业绩，令投资者对锐奇股份的盈利能力产生了质疑。",
            "1月8日和9日，两家光伏公司天合光能和晶科电力分别申请上会。然而，根据上海证券交易所发布2020年第一次科创板上市委审议会议结果，暂缓审议天合光能股份有限公司（下称天合光能）发行上市。这也是2020年的首例暂缓审议。\n" +
                    "\n" +
                    "上交所公告显示，科创板上市委委员对天合光能提出了四点审核意见，包括：如实际控制人发生违反《信托贷款合同》约定的情况，如何保证其控股权不受影响；是否已履行了完备的集体用地相关经营权流转手续等。\n" +
                    "\n" +
                    "上市委委员会还发现，截至2019年6月30日，天合光能应收与可再生能源补贴款相关的账款余额为2.9亿元，其中有九个电站的补贴收入还未进入国家补贴名录，需补充披露尚未进入国家补贴名录的补贴收入的详细情况。\n" +
                    "\n" +
                    "此外，天合光能收购Nclave产生了商誉1.4亿元，需进一步说明预计 Nclave 2019 -2023年期间销售收入增长2.4%-39% 的依据。\n" +
                    "\n" +
                    "公告发出后，第一财经记者联系天合光能方面，截至发稿，尚未获得回应。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "天合光能的主要业务包括光伏产品、光伏系统以及智慧能源三大类。根据咨询公司IHS发布的出货量排名数据，天合光能在2016年-2018年的出货量均位列全球前三名。目前该公司正面临业务转型，其光伏组件占主营业务收入的比重逐年降低，从2016年的93.04%下降至2018年的59.81%。\n" +
                    "\n" +
                    "招股说明书显示，2018年天合光能营业收入250.54亿元，同比下降4.22%；净利润5.56亿，同比下降8.23%；公司资产负债率为47.73%。2017年，营业收入为261.59亿，净利润6.04亿，资产负债率为48.67%。2016年，营业收入225.94亿，净利润5.3亿，资产负债率61.83%。\n" +
                    "\n" +
                    "2019年1-6月，天合光能营业收入107.64亿，归母净利润1.43亿。披露数据显示，天合光能的营业收入中，海外市场占比较大，而中国市场仅占营收的32.75%。\n" +
                    "\n" +
                    "近年来，登陆美股的光伏中概股争相“回A”，主要原因是中国光伏企业在美估值普遍过低，融资困难。保利协鑫副总裁吕锦标曾对媒体表示，不少中国的光伏龙头企业在海外上市，但被资本市场严重低估，有些完全丧失了再融资能力。反而是A股的光伏公司在资本市场中备受追捧，不断发展壮大。\n" +
                    "\n" +
                    "1997年，天合光能创立于江苏常州。2006年，天合光能以天合开曼为境外上市主体，在纽约证券交易所正式挂牌报价交易。2017年3月，天合开曼完成私有化交易，同时停止其ADS在纽交所的交易，正式从纽交所退市。\n" +
                    "\n" +
                    "天合光能并不是唯一一家从美股退市，欲回归A股的光伏企业。\n" +
                    "\n" +
                    "2018年7月17日，晶澳太阳能宣布完成与控股母公司的合并交易，正式从美国纳斯达克退市并成为私有公司。2019年9月，证监会审核结果公告显示，天业通联发行股份购买晶澳太阳能有限公司的方案获有条件通过，这意味着晶澳太阳能（002459.SZ）正式拿到了A股通行证，成为首家光伏中概股借壳“回A”的企业。\n" +
                    "\n" +
                    "此外，保利协鑫（3800.HK）曾于2017年发布公告，称拟将公司的多晶硅、硅片等光伏材料业务分拆，并实现A股上市，但公告发布时并未达成任何实质性进展。招银国际曾预期分拆业务将于2019年上市，不过此后保利协鑫分拆回A一事也暂时没有下文。\n" +
                    "\n" +
                    "值得关注的是，晶科电力也在发力IPO，今日（1月9日），中国证券监督管理委员会将审核晶科电力科技股份有限公司的首发申请。晶科集团持有晶科电力39.31%的股份，为公司的控股股东。此前，晶科电力曾是目前在美股上市的晶科能源（JKS.NYSE）旗下的子公司，2016年11月，晶科能源分拆晶科光伏电力的下游光伏业务。\n" +
                    "\n" +
                    "晶科电力主营业务光伏电站运营、光伏电站转让和光伏电站 EPC 等。披露数据显示，2018年，晶科电力实现营业收入70.66亿元，归属于母公司所有者的净利润9.21亿元。截至2018年年末，公司负债合计236.01亿元。2017年，晶科电力营业收入40.53亿元，归母净利润6.87亿元；2016年，公司营收18.58亿元，归母净利润1.46亿元。\n" +
                    "\n" +
                    "招股书显示，2016年-2018年，晶科电力资产负债率分别为83.54%、79.04%、75.68%，相比之下，遭到暂缓审议的天合光能20160-2018年的资产负债率，则分别为61.83%、48.67%、47.73%。在光伏补贴退坡、电价下降、补贴拖欠的情况下，晶科电力的资金压力进一步扩大，其过高的负债率是否会成为IPO拖累，需要今日进一步关注今日上会审批结果。",
            "在外围市场创新高等利好因素影响下，今天早盘各大指数高开高走。截至上午收盘，深证成指、中小板指、创业板指等三大指数齐创反弹新高，其中创业板指盘中突破1900点大关，中小板指逼近7000点关口。\n" +
                    "\n" +
                    "板块轮动300多只个股股价翻倍\n" +
                    "\n" +
                    "自上证指数去年1月初见阶段底部2440点以来，上证指数累计涨幅超过24%，深证成指涨幅超过51%，中小板指数涨幅接近50%，创业板指涨幅超过53%。个股表现更加精彩纷呈，卓胜微、万集科技、诚迈科技等近300只股票翻倍，普利制药、格力电器、傲农生物等600多股涨超50%。\n" +
                    "\n" +
                    "涨幅最大的股票是芯片概念龙头卓胜微，累计涨幅高达706.53%居首；ETC概念龙头万集科技涨幅位居次席，累计涨幅达到579.51%；国产软件概念龙头诚迈科技累计上涨555.11%位居第三位。此外，太阳能概念龙头福莱特、网红概念龙头星期六、芯片概念龙头韦尔股份等10多只个股涨幅超过3倍。\n" +
                    "\n" +
                    "梳理近期的行情可以发现，以往涨势凶猛的芯片概念，有所调整。而同样活跃性较强的新能源汽车、网络游戏、太阳能等概念，表现抢眼。板块轮动是牛市行情的重要特征，目前仍在低位的小市值股票，或将在未来跑赢大盘。\n" +
                    "\n" +
                    "43股小市值高增长 且股价滞涨\n" +
                    "\n" +
                    "证券时报·数据 宝统计显示，有近1900股2440点以来涨幅不足20%。表现最差的股票是退市华业，2440点以来以来股价跌超87%居首。另外，*ST秋林、*ST信威、派生科技、*ST节能等4股跌幅均超过70%，分列跌幅榜第二至第四位，*ST北讯、*ST欧浦、*ST赫美等10多只个股腰斩。\n" +
                    "\n" +
                    "值得注意的是，排除ST股，去年前三季度净利增长超过20%、滚动市盈率不足20倍的个股中，有43只个股市值低于50亿元且2440点以来股价涨幅在20%以下甚至逆市下跌。其中，德新交运、启迪设计、山西路桥等个股跌幅超过10%，南兴股份、银龙股份、中设集团等个股也逆市下跌。\n" +
                    "\n" +
                    "从净利增速来看，桂东电力、世纪星源、东百集团、嘉寓股份等4股去年三季报净利增速均超过5倍，粤宏远A、栖霞建设、青龙管业等个股净利同比翻倍。市盈率角度看， 栖霞建设、山西路桥、嘉寓股份、粤宏远A等个股最新滚动市盈率均低于10倍。一些个股得到了机构较高的关注度，包括中设集团、博世科、健盛集团等个股，均有10家以上机构评级。\n" +
                    "\n" +
                    "博世科得到了国开证券、招商证券、国海证券等10多家券商的评级。其中，招商证券强烈推荐博世科，预计公司2019-2021年业绩为3.3、4.3、5.5亿元，暂不考虑增发对股本的影响，对应PE为11.1倍、8.5倍、6.5倍，维持强烈推荐。\n" +
                    "\n" +
                    "健盛集团得到天风证券、华西证券、国盛证券等诸多家券商评级。其中，华西证券预计公司2019-2021年EPS 分别为0.65、0.77、0.94元，其判断未来随着公司盈利稳定性提升、估值有望再上一台阶。",
            "在外围市场创新高等利好因素影响下，今天早盘各大指数高开高走。截至上午收盘，深证成指、中小板指、创业板指等三大指数齐创反弹新高，其中创业板指盘中突破1900点大关，中小板指逼近7000点关口。\n" +
                    "\n" +
                    "板块轮动300多只个股股价翻倍\n" +
                    "\n" +
                    "自上证指数去年1月初见阶段底部2440点以来，上证指数累计涨幅超过24%，深证成指涨幅超过51%，中小板指数涨幅接近50%，创业板指涨幅超过53%。个股表现更加精彩纷呈，卓胜微、万集科技、诚迈科技等近300只股票翻倍，普利制药、格力电器、傲农生物等600多股涨超50%。\n" +
                    "\n" +
                    "涨幅最大的股票是芯片概念龙头卓胜微，累计涨幅高达706.53%居首；ETC概念龙头万集科技涨幅位居次席，累计涨幅达到579.51%；国产软件概念龙头诚迈科技累计上涨555.11%位居第三位。此外，太阳能概念龙头福莱特、网红概念龙头星期六、芯片概念龙头韦尔股份等10多只个股涨幅超过3倍。\n" +
                    "\n" +
                    "梳理近期的行情可以发现，以往涨势凶猛的芯片概念，有所调整。而同样活跃性较强的新能源汽车、网络游戏、太阳能等概念，表现抢眼。板块轮动是牛市行情的重要特征，目前仍在低位的小市值股票，或将在未来跑赢大盘。\n" +
                    "\n" +
                    "43股小市值高增长 且股价滞涨\n" +
                    "\n" +
                    "证券时报·数据 宝统计显示，有近1900股2440点以来涨幅不足20%。表现最差的股票是退市华业，2440点以来以来股价跌超87%居首。另外，*ST秋林、*ST信威、派生科技、*ST节能等4股跌幅均超过70%，分列跌幅榜第二至第四位，*ST北讯、*ST欧浦、*ST赫美等10多只个股腰斩。\n" +
                    "\n" +
                    "值得注意的是，排除ST股，去年前三季度净利增长超过20%、滚动市盈率不足20倍的个股中，有43只个股市值低于50亿元且2440点以来股价涨幅在20%以下甚至逆市下跌。其中，德新交运、启迪设计、山西路桥等个股跌幅超过10%，南兴股份、银龙股份、中设集团等个股也逆市下跌。\n" +
                    "\n" +
                    "从净利增速来看，桂东电力、世纪星源、东百集团、嘉寓股份等4股去年三季报净利增速均超过5倍，粤宏远A、栖霞建设、青龙管业等个股净利同比翻倍。市盈率角度看， 栖霞建设、山西路桥、嘉寓股份、粤宏远A等个股最新滚动市盈率均低于10倍。一些个股得到了机构较高的关注度，包括中设集团、博世科、健盛集团等个股，均有10家以上机构评级。\n" +
                    "\n" +
                    "博世科得到了国开证券、招商证券、国海证券等10多家券商的评级。其中，招商证券强烈推荐博世科，预计公司2019-2021年业绩为3.3、4.3、5.5亿元，暂不考虑增发对股本的影响，对应PE为11.1倍、8.5倍、6.5倍，维持强烈推荐。\n" +
                    "\n" +
                    "健盛集团得到天风证券、华西证券、国盛证券等诸多家券商评级。其中，华西证券预计公司2019-2021年EPS 分别为0.65、0.77、0.94元，其判断未来随着公司盈利稳定性提升、估值有望再上一台阶。",
            "卓胜微 、万集科技、诚迈科技等近300只股票2440点以来股价翻倍，另外，仍有43只低市值低估值股滞涨或逆市下跌。\n" +
                    "\n" +
                    "在外围市场创新高等利好因素影响下，今天早盘各大指数高开高走。截至上午收盘，深证成指、中小板指、创业板指等三大指数齐创反弹新高，其中创业板指盘中突破1900点大关，中小板指逼近7000点关口。\n" +
                    "\n" +
                    "板块轮动300多只个股股价翻倍\n" +
                    "\n" +
                    "自上证指数去年1月初见阶段底部2440点以来，上证指数累计涨幅超过24%，深证成指涨幅超过51%，中小板指数涨幅接近50%，创业板指涨幅超过53%。个股表现更加精彩纷呈，卓胜微、万集科技、诚迈科技等近300只股票翻倍，普利制药、格力电器、傲农生物等600多股涨超50%。\n" +
                    "\n" +
                    "涨幅最大的股票是芯片概念龙头卓胜微，累计涨幅高达706.53%居首；ETC概念龙头万集科技涨幅位居次席，累计涨幅达到579.51%；国产软件概念龙头诚迈科技累计上涨555.11%位居第三位。此外，太阳能概念龙头福莱特、网红概念龙头星期六、芯片概念龙头韦尔股份等10多只个股涨幅超过3倍。\n" +
                    "\n" +
                    "梳理近期的行情可以发现，以往涨势凶猛的芯片概念，有所调整。而同样活跃性较强的新能源汽车、网络游戏、太阳能等概念，表现抢眼。板块轮动是牛市行情的重要特征，目前仍在低位的小市值股票，或将在未来跑赢大盘。\n" +
                    "\n" +
                    "43股小市值高增长 且股价滞涨\n" +
                    "\n" +
                    "证券时报·数据宝统计显示，有近1900股2440点以来涨幅不足20%。表现最差的股票是退市华业，2440点以来以来股价跌超87%居首。另外，*ST秋林、*ST信威、派生科技、*ST节能等4股跌幅均超过70%，分列跌幅榜第二至第四位，*ST北讯、*ST欧浦、*ST赫美等10多只个股腰斩。\n" +
                    "\n" +
                    "值得注意的是，排除ST股，去年前三季度净利增长超过20%、滚动市盈率不足20倍的个股中，有43只个股市值低于50亿元且2440点以来股价涨幅在20%以下甚至逆市下跌。其中，德新交运、启迪设计、山西路桥等个股跌幅超过10%，南兴股份、银龙股份、中设集团等个股也逆市下跌。\n" +
                    "\n" +
                    "从净利增速来看，桂东电力、世纪星源、东百集团、嘉寓股份等4股去年三季报净利增速均超过5倍，粤宏远A、栖霞建设、青龙管业等个股净利同比翻倍。市盈率角度看， 栖霞建设、山西路桥、嘉寓股份、粤宏远A等个股最新滚动市盈率均低于10倍。一些个股得到了机构较高的关注度，包括中设集团、博世科、健盛集团等个股，均有10家以上机构评级。\n" +
                    "\n" +
                    "博世科得到了国开证券、招商证券、国海证券等10多家券商的评级。其中，招商证券强烈推荐博世科，预计公司2019-2021年业绩为3.3、4.3、5.5亿元，暂不考虑增发对股本的影响，对应PE为11.1倍、8.5倍、6.5倍，维持强烈推荐。\n" +
                    "\n" +
                    "健盛集团得到天风证券、华西证券、国盛证券等诸多家券商评级。其中，华西证券预计公司2019-2021年EPS分别为0.65、0.77、0.94元，其判断未来随着公司盈利稳定性提升、估值有望再上一台阶。",
            "2019年国家科学技术奖颁奖典礼举行在即。虽然最终获奖名单尚未公布，但依照“不超过初评结果”的原则，多家上市公司有望获得殊荣。\n" +
                    "\n" +
                    "查看2019年的初评名单，一个最显著的特点是：申报项目更加面向基础工业领域，比如石化、机械等，而中医药、大飞机等领域的项目令人耳目一新。\n" +
                    "\n" +
                    "记者查阅初评获奖名单，多个项目的主要完成人中不乏上市公司身影，比如博世科、振华重工、太钢不锈、中信特钢、以岭药业等。\n" +
                    "\n" +
                    "国家科技奖花落谁家?\n" +
                    "\n" +
                    "国家科学技术奖由国务院设立，意在奖励在科技进步活动中作出突出贡献的公民、组织。\n" +
                    "\n" +
                    "国家科学技术奖包括国家最高科学技术奖、国家自然科学奖、国家技术发明奖、国家科学技术进步奖、中华人民共和国国际科学技术合作奖等五大奖项。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "2019年国家科学技术奖初评结果显示，南开大学周其林等4人完成的“高效手性螺环催化剂的发现”项目入围自然科学奖一等奖提名。\n" +
                    "\n" +
                    "技术发明奖初评名单显示，有三个项目获得一等奖提名，分别为：6～8m超大采高综采关键技术与装备、大型二氧化氯制备系统及纸浆无元素氯漂白关键技术及应用、复杂机场高精度飞行校验技术及装备。\n" +
                    "\n" +
                    "而技术进步奖则“硕果累累”，入围特等奖的就有三项：中东巨厚复杂碳酸盐岩油藏亿吨级产能工程及高效开发、海上大型绞吸疏浚装备的自主研发与产业化、长江三峡枢纽工程。此外，入围一等奖的达15项。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "多家上市公司参与其中\n" +
                    "\n" +
                    "由于更注重发明和产业化，国家科学技术奖中的技术发明奖和技术进步奖离日常生活更近，也更具看点，有望给参与单位带来快速产业化或技术提升机遇。\n" +
                    "\n" +
                    "上证报梳理2019年国家科学技术奖初评名单，多家上市公司（及旗下子公司）参与的项目入围技术发明奖、技术进步奖的一等奖、特等奖提名。\n" +
                    "\n" +
                    "在技术发明奖初评一等奖中，“6～8m超大采高综采关键技术与装备”项目有天地科技、兖矿集团、中煤能源等多家上市公司参与。\n" +
                    "\n" +
                    "\n" +
                    "具体来看，“6～8m超大采高综采关键技术与装备”的主要完成人包括天地科技股份有限公司的王国法、任怀伟、李明忠，兖矿集团有限公司的孟祥军、中煤张家口煤矿机械有限责任公司的穆润青、西安煤矿机械有限公司的赵友军。\n" +
                    "\n" +
                    "其中，兖矿集团有限公司隶属兖矿集团，中煤张家口煤矿机械有限责任公司在是中煤能源的间接参股公司。\n" +
                    "\n" +
                    "技术进步奖入围特等奖的项目主要完成人背后的上市公司包括：中石油、振华重工、长江电力、葛洲坝、中国交建、中国铁建、中国动力等。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "具体来看，“中东巨厚复杂碳酸盐岩油藏亿吨级产能工程及高效开发”项目的主要完成单位包括中国石油国际勘探开发有限公司、中国石油旗下勘探开发研究院、中油工程旗下中国石油工程建设有限公司。\n" +
                    "\n" +
                    "“海上大型绞吸疏浚装备的自主研发与产业化”的主要完成单位则包括振华重工、中交疏浚（集团）股份有限公司（中国交建的全资子公司）、中国铁建港航局集团有限公司（中国铁建的全资子公司）、上海齐耀重工有限公司（中国动力的全资子公司）。\n" +
                    "\n" +
                    "“长江三峡枢纽工程”项目参与者背后更是大央企云集，其中上市公司有哈尔滨电气（通过全资子公司哈尔滨电机厂有限责任公司）、东方电气（通过全资子公司东方电气集团东方电机有限公司）、长江电力、葛洲坝等。\n" +
                    "\n" +
                    "技术进步奖初评一等奖入围项目多达15个，主要完成单位更是包括多家上市公司，或者上市公司子公司。\n" +
                    "\n" +
                    "“水煤浆水冷壁气化炉系列技术及产业化”的主要完成人包括山西阳煤化工机械（集团）有限公司（阳煤化工持有其100%股权）、阳煤丰喜肥业（集团）有限责任公司（阳煤化工的全资子公司）。\n" +
                    "\n" +
                    "“高品质特殊钢绿色高效电渣重熔关键技术的开发和应用”的主要完成人包括舞阳钢铁有限责任公司（河北钢铁的参股子公司）、通裕重工、中信特钢及其全资子公司江阴兴澄特种钢铁有限公司。\n" +
                    "\n" +
                    "“先进核电站大型模块化钢板-混凝土组合结构关键技术及应用”主要完成人中，上市公司有中国中冶（通过全资子公司中冶建筑研究总院有限公司）、中国核建（通过全资子公司中国核工业第二二建设有限公司、中国核工业二四建设有限公司）、太钢不锈等。\n" +
                    "\n" +
                    "“FT-1500A高性能通用64位微处理器及应用”的主要完成单位之一的天津飞腾信息技术有限公司，为中国长城的参股子公司。\n" +
                    "\n" +
                    "“上海中心大厦工程关键技术”项目的背后有上海建工及其全资子公司上海市机械施工集团有限公司、三一重工（通过全资子公司三一汽车制造有限公司）。\n" +
                    "\n" +
                    "“复杂艰险山区高速公路大规模隧道群建设及营运安全关键技术”项目背后上市公司有招商公路（通过全资子公司招商局重庆交通科研设计院有限公司）、四川路桥（通过全资子公司四川公路桥梁建设集团有限公司）。\n" +
                    "\n" +
                    "“露天矿山岩体参数精细快速获取与边坡稳定性定量评价”的主要完成人之一中国恩菲工程技术有限公司，是中国中冶的控股孙公司。\n" +
                    "\n" +
                    "除了大央企，民营企业也频现初评获奖入围名单。\n" +
                    "\n" +
                    "“高光效长寿命半导体照明关键技术与产业化”项目的背后有LED及第三代半导体龙头公司三安光电、新三板公司华联电子（联创光电控股子公司）、洲明科技、碧水源（通过控股子公司北京良业环境技术股份有限公司）、鸿利智汇、国星光电、光莆股份等。\n" +
                    "\n" +
                    "“制浆造纸清洁生产与水污染全过程控制关键技术及产业化”的主要完成单位包括太阳纸业、华泰股份。\n" +
                    "\n" +
                    "“高层钢-混凝土混合结构的理论、技术与工程应用”的背后有精工钢构（通过全资子公司浙江绿筑集成科技有限公司）、中国中冶（通过全资子公司中冶建筑研究总院有限公司）。\n" +
                    "\n" +
                    "“中医脉络学说构建及其指导微血管病变防治”项目的主要完成人之一河北以岭医药研究院有限公司，是以岭药业全资子公司。",
            "暴涨137%的大黑马惠发食品(603536)又疯了，在“一”字式的暴跌背景下，今日上亿资金强势进场，硬生生撬开跌停板。半天换手率就达到57.06%，成交额达到5.23亿元。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "4万元成交额登上龙虎榜\n" +
                    "\n" +
                    "1月9日，4跌停后的惠发食品，继续以14.63元/股的跌停价开盘。不过，9：30开盘后， 93163手买单，迅速撬开了第5个跌停板。随后强势拉升，短短3分钟，就从跌停板上翻红。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "截至9日午间收盘，惠发食品报收16.88元/股，涨3.88%，换手率57.06% ，成交额5.23亿元。其中，成交额已创下公司2017年6月上市以来的历史新高。而半日57.06%的换手率，位居公司上市以来的第三位，67.44%和61.59%、是前两位的全天换手率。\n" +
                    "\n" +
                    "近日，惠发食品在暴涨之后，突然上演“一字断魂刀” 式暴跌，市场人士戏称“这是庄家跑路暴力砸盘，并非没有可能”。\n" +
                    "\n" +
                    "1月3日上午，惠发食品盘中闪崩，报收22.3元，全天成交3.45亿元。公司前期暴涨的模式就此终止。到1月8日，公司已经连续3个跌停，这也意味着1月3日进场接盘的上亿资金遭闷杀，没有机会逃生。\n" +
                    "\n" +
                    "公布的交易公开信息显示，在1月8日的交易中，华鑫证券上海新闸路营业部等3家营业部，成为卖出金额最大的前3名营业部，合计卖出1142.22万元。其中，招商证券深圳招商证券大厦营业部，仅凭借单日4.39万元的成交额，竟然登上了龙虎榜。\n" +
                    "\n" +
                    "买入金额最大的前5名营业部包括东亚前海浙江分公司等，5家营业部合计买入188.34万元。其中，买入额最大的营业部为109.85万元，最小买入额也只有16.25万元。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "神秘私募趁机套现离场\n" +
                    "\n" +
                    "e公司记者发现，在惠发食品前期的暴涨行情中，北京一家私募机构可能是最大受益者。\n" +
                    "\n" +
                    "此次暴涨前，惠发食品2019年11月1日公告称，股东北京弘富成长投资管理中心（有限合伙）（以下简称“弘富投资”）计划自公告日起，6个月内通过集中竞价方式或者大宗交易方式，减持数量不超过504万股公司股份，不超过公司总股本的3%。\n" +
                    "\n" +
                    "在惠发食品这一波暴涨中，弘富投资有没有受益，答案是肯定的。\n" +
                    "\n" +
                    "在减持计划公布后，弘富投资实际减持情况怎样？交易信息显示，2019年11月25日-2019年12月11日，北京弘富减持168万股，累计套现金额达1925万元，其持股比例降至1.79%。\n" +
                    "\n" +
                    "换而言之，在惠发股份此轮暴涨的上升阶段，弘富投资趁机一路减持，截至2019年12月11日，套现了1925万元。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "虽说没有抛在高位，不过后面的上涨，应该也是弘富投资所愿意看到的。因为按照504万股的减持计划，该公司仍有336万股在手，且可以随时套现。\n" +
                    "\n" +
                    "从2019年12月12日到2020年1月2日，惠发食品又继续上涨了近80%。在后续的上涨过程中，弘富投资到底套现了多少，那只有公司自己知道了。\n" +
                    "\n" +
                    "弘富投资到底是何方神圣？天眼查显示，该公司成立于2012年，经营范围为投资管理、资产管理。作为一家有限合伙企业，在14位股东中，自然人股东占了12位。\n" +
                    "\n" +
                    "惠发食品成立于2005年，经过12年的发展，公司于2017年6月在上交所上市，弘富投资是公司原始股东。\n" +
                    "\n" +
                    "招股说明书显示，2012年4月，惠发食品决定引入外部投资者，弘富投资向惠发食品新增投资共计5000万元，增资后，弘富投资占比为6.57%。2017年惠发食品发行上市时，弘富投资持股591.94万股，占总股本4.93%。\n" +
                    "\n" +
                    "雪崩式陨落不意外\n" +
                    "\n" +
                    "连续5跌停的惠发食品，似乎还看不到止跌的迹象。若果此轮下跌公司股价又跌至原点，投资者也不要觉得意外。\n" +
                    "\n" +
                    "成立于2005年的惠发食品，是一家速冻调理肉制品研发销售商，主要从事包括速冻丸类制品、肠类制品、油炸类等速冻肉制品的研发、生产和销售业务。\n" +
                    "\n" +
                    "惠发食品2017在上交所上市，当年实现营业收入9.39亿元，归母净利润为6038万元，同比分别增长5.51%、43.36%。\n" +
                    "\n" +
                    "不过，惠发食品的辉煌只是昙花一现。随后，公司的经营业绩便一路下跌。\n" +
                    "\n" +
                    "财报数据显示，2018年，公司实现净利润为4546.08万元，同比下降24.71%。2019年以来，公司业绩上演雪崩式下跌：2019年前三季度，归母净利润亏损超4034万元，同比下降超299%，系上市以来首次亏损。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "对于上半年业绩亏损的原因，公司解释称：去皮鸡大胸、冰鲜大胸、鸡皮等原材料的变动使得成本上升2111万元，而销售价格却出现下调。\n" +
                    "\n" +
                    "如果不出意外的话，预计惠发食品全年亏损。\n" +
                    "\n" +
                    "在惠发食品经营不善之时，同行业的三全食品、海欣食品、安井食品等，在2019前三季度均保持着盈利状态。其中，三全食品、安井食品的净利润更是分别增长超30%、21%。\n" +
                    "\n" +
                    "伴随着业绩的大幅下滑，惠发食品还存在一定的短期偿债压力。数据显示，截至2019年三季度末，公司短期借款账面价值3.7亿，一年内到期的非流动负债0.55亿，而货币资金余额仅2.62亿。\n" +
                    "\n" +
                    "然而，基本面乏善可陈的惠发食品，却在2019年年末成为两市的大黑马。\n" +
                    "\n" +
                    "二级市场显示，2019年11月28日至2020年1月2日期间，惠发食品股价大涨137%。25个交易日仅一天下跌，期间涨幅仅次于网红概念股星期六、引力传媒和宝能系增持的南宁百货。\n" +
                    "\n" +
                    "不过，没有基本面支持的暴涨，终将以崩盘收场。2012月1月3日，惠发食品掉头向下。\n" +
                    "\n" +
                    "异常交易引起监管关注\n" +
                    "\n" +
                    "庄股往往具有市值小、流通盘小、筹码集中、暴涨暴跌等特征。惠发食品的诡异走势，市场不禁将其与庄股联系到一起。\n" +
                    "\n" +
                    "e公司发现，在过去两年，惠发食品的股份整体呈集中趋势。Wind数据显示，截止到2019年三季度末，惠发食品的股东户数仅有8017户，较2017年下降了73.5%。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "同时，惠发食品的实际流通市值非常小，流通股仅6025万股，流通市值仅10.88亿元。同时，前十大流通股东中个人投资者居多，且多数是在2019年三季度期间，潜伏、新进的流通股股东。\n" +
                    "\n" +
                    "另外，截至2019年三季度末，公司前十大流通股东中，自然人股东占据了8席，其中3位股东为新进入者。从持股情况来看，上榜的进入门槛较低，第十大流动股东的持股仅57.48万股。按照当时约10元/股的股价，约600万就可以成为公司前十大流通股东。\n" +
                    "\n" +
                    "上述特征，均属于容易被资金操纵的明显特征。\n" +
                    "\n" +
                    "实际上，惠发食品如此诡异的走势，更是引起了监管层的重点关注。\n" +
                    "\n" +
                    "1月6日，上交所向惠发食品下发监管工作函，就近期股票交易异常明确监管要求，涉及对象包括上市公司、董事、监事、高级管理人员及控股股东、实际控制人。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "1月8日，惠发食品公告称，经公司自查，公司目前生产经营活动正常，内外部经营环境未发生重大变化，也不存在预计将要发生重大变化的情形，日常经营情况未发生重大变化。\n" +
                    "\n" +
                    "同时，经向公司控股股东山东惠发投资有限公司及实际控制人惠增玉、赵宏宇书面函证核实，截止目前，不存在影响公司股票交易价格异常波动的重大事项；不存在其他应披露而未披露的重大信息，包括但不限于重大资产重组、股份发行、收购、债务重组、业务重组、资产剥离、资产注入、股份回购、股权激励、破产重整、重大业务合作、引进战略投资者等重大事项。",
            "1月9日，4跌停后的惠发食品，继续以14.63元/股的跌停价开盘。不过，9：30开盘后， 93163手买单，迅速撬开了第5个跌停板。随后强势拉升，短短3分钟，就从跌停板上翻红。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "截至9日午间收盘，惠发食品报收16.88元/股，涨3.88%，换手率57.06% ，成交额5.23亿元。其中，成交额已创下公司2017年6月上市以来的历史新高。而半日57.06%的换手率，位居公司上市以来的第三位，67.44%和61.59%、是前两位的全天换手率。近日，惠发食品在暴涨之后，突然上演“一字断魂刀” 式暴跌，市场人士戏称“这是庄家跑路暴力砸盘，并非没有可能”。1月3日上午，惠发食品盘中闪崩，报收22.3元，全天成交3.45亿元。公司前期暴涨的模式就此终止。到1月8日，公司已经连续3个跌停，这也意味着1月3日进场接盘的上亿资金遭闷杀，没有机会逃生。公布的交易公开信息显示，在1月8日的交易中，华鑫证券上海新闸路营业部等3家营业部，成为卖出金额最大的前3名营业部，合计卖出1142.22万元。其中，招商证券深圳招商证券大厦营业部，仅凭借单日4.39万元的成交额，竟然登上了龙虎榜。买入金额最大的前5名营业部包括东亚前海浙江分公司等，5家营业部合计买入188.34万元。其中，买入额最大的营业部为109.85万元，最小买入额也只有16.25万元。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "e公司记者发现，在惠发食品前期的暴涨行情中，北京一家私募机构可能是最大受益者。此次暴涨前，惠发食品2019年11月1日公告称，股东北京弘富成长投资管理中心（有限合伙）（以下简称“弘富投资”）计划自公告日起，6个月内通过集中竞价方式或者大宗交易方式，减持数量不超过504万股公司股份，不超过公司总股本的3%。在惠发食品这一波暴涨中，弘富投资有没有受益，答案是肯定的。在减持计划公布后，弘富投资实际减持情况怎样？交易信息显示，2019年11月25日-2019年12月11日，北京弘富减持168万股，累计套现金额达1925万元，其持股比例降至1.79%。换而言之，在惠发股份此轮暴涨的上升阶段，弘富投资趁机一路减持，截至2019年12月11日，套现了1925万元。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "虽说没有抛在高位，不过后面的上涨，应该也是弘富投资所愿意看到的。因为按照504万股的减持计划，该公司仍有336万股在手，且可以随时套现。从2019年12月12日到2020年1月2日，惠发食品又继续上涨了近80%。在后续的上涨过程中，弘富投资到底套现了多少，那只有公司自己知道了。弘富投资到底是何方神圣？天眼查显示，该公司成立于2012年，经营范围为投资管理、资产管理。作为一家有限合伙企业，在14位股东中，自然人股东占了12位。惠发食品成立于2005年，经过12年的发展，公司于2017年6月在上交所上市，弘富投资是公司原始股东。招股说明书显示，2012年4月，惠发食品决定引入外部投资者，弘富投资向惠发食品新增投资共计5000万元，增资后，弘富投资占比为6.57%。2017年惠发食品发行上市时，弘富投资持股591.94万股，占总股本4.93%。连续5跌停的惠发食品，似乎还看不到止跌的迹象。若果此轮下跌公司股价又跌至原点，投资者也不要觉得意外。成立于2005年的惠发食品，是一家速冻调理肉制品研发销售商，主要从事包括速冻丸类制品、肠类制品、油炸类等速冻肉制品的研发、生产和销售业务。惠发食品2017在上交所上市，当年实现营业收入9.39亿元，归母净利润为6038万元，同比分别增长5.51%、43.36%。不过，惠发食品的辉煌只是昙花一现。随后，公司的经营业绩便一路下跌。财报数据显示，2018年，公司实现净利润为4546.08万元，同比下降24.71%。2019年以来，公司业绩上演雪崩式下跌：2019年前三季度，归母净利润亏损超4034万元，同比下降超299%，系上市以来首次亏损。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "对于上半年业绩亏损的原因，公司解释称：去皮鸡大胸、冰鲜大胸、鸡皮等原材料的变动使得成本上升2111万元，而销售价格却出现下调。如果不出意外的话，预计惠发食品全年亏损。在惠发食品经营不善之时，同行业的三全食品、海欣食品、安井食品等，在2019前三季度均保持着盈利状态。其中，三全食品、安井食品的净利润更是分别增长超30%、21%。伴随着业绩的大幅下滑，惠发食品还存在一定的短期偿债压力。数据显示，截至2019年三季度末，公司短期借款账面价值3.7亿，一年内到期的非流动负债0.55亿，而货币资金余额仅2.62亿。然而，基本面乏善可陈的惠发食品，却在2019年年末成为两市的大黑马。二级市场显示，2019年11月28日至2020年1月2日期间，惠发食品股价大涨137%。25个交易日仅一天下跌，期间涨幅仅次于网红概念股星期六、引力传媒和宝能系增持的南宁百货。不过，没有基本面支持的暴涨，终将以崩盘收场。2012月1月3日，惠发食品掉头向下。庄股往往具有市值小、流通盘小、筹码集中、暴涨暴跌等特征。惠发食品的诡异走势，市场不禁将其与庄股联系到一起。e公司发现，在过去两年，惠发食品的股份整体呈集中趋势。Wind数据显示，截止到2019年三季度末，惠发食品的股东户数仅有8017户，较2017年下降了73.5%。\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "同时，惠发食品的实际流通市值非常小，流通股仅6025万股，流通市值仅10.88亿元。同时，前十大流通股东中个人投资者居多，且多数是在2019年三季度期间，潜伏、新进的流通股股东。另外，截至2019年三季度末，公司前十大流通股东中，自然人股东占据了8席，其中3位股东为新进入者。从持股情况来看，上榜的进入门槛较低，第十大流动股东的持股仅57.48万股。按照当时约10元/股的股价，约600万就可以成为公司前十大流通股东。上述特征，均属于容易被资金操纵的明显特征。实际上，惠发食品如此诡异的走势，更是引起了监管层的重点关注。1月6日，上交所向惠发食品下发监管工作函，就近期股票交易异常明确监管要求，涉及对象包括上市公司、董事、监事、高级管理人员及控股股东、实际控制人。\n" +
                    "\n" +
                    "1月8日，惠发食品公告称，经公司自查，公司目前生产经营活动正常，内外部经营环境未发生重大变化，也不存在预计将要发生重大变化的情形，日常经营情况未发生重大变化。同时，经向公司控股股东山东惠发投资有限公司及实际控制人惠增玉、赵宏宇书面函证核实，截止目前，不存在影响公司股票交易价格异常波动的重大事项；不存在其他应披露而未披露的重大信息，包括但不限于重大资产重组、股份发行、收购、债务重组、业务重组、资产剥离、资产注入、股份回购、股权激励、破产重整、重大业务合作、引进战略投资者等重大事项。",
            "世界变化太快。昨晚，美国总统特朗普在华盛顿白宫发表电视讲话时表示，美方不想使用武力。\n" +
                    "\n" +
                    "今日亚太股市全线飘红，日经225指数涨幅超过2%，韩国综合指数涨幅超过1%，与昨日的下跌形成鲜明的对比。\n" +
                    "\n" +
                    "A股市场三大指数全线高开，截至午间收盘，上证指数上涨0.47%至3081.36点，深证成指上涨1.07%至10820.96点，创业板指上涨1.75%至1895.27点，盘中一度站上1900点，创2018年4月以来新高。截至午间收盘，两市上涨个股数超过2800只，涨停个股达到47只。\n" +
                    "\n" +
                    "冰与火交织\n" +
                    "\n" +
                    "今日早盘，多个板块表现活跃，申万一级28个行业有24个行业上涨，9个行业板块涨幅超过1%，通信、医药生物、计算机行业涨幅居前，分别上涨2.21%、2.01%、1.92%。概念板块中操作系统、光模块、密码学、ETC等板块表现活跃。\n" +
                    "\n" +
                    "与之形成鲜明对比的是，昨日涨势火热的黄金概念股今日下跌明显，截至午间收盘，Wind黄金珠宝指数下跌3.78%，位居概念板块跌幅首位。昨日大涨的恒邦股份、金洲慈航、湖南黄金、赤峰黄金等均跌逾6%。\n" +
                    "\n" +
                    "出现明显调整的还有军工板块，昨日，申万国防军工行业指数上涨2.46%，涨幅位居行业板块首位。今日，军工板块跌幅位列行业板块首位，截至午间收盘，申万国防军工行业指数下跌2.18%，板块内超过9成个股下跌，昨日大涨的航天彩虹、洪都航空、晨曦航空、中兵红箭、雷科防务等今日均出现明显下跌。\n" +
                    "\n" +
                    "北向资金持续加仓\n" +
                    "\n" +
                    "在A股市场上演“冰与火的盛宴”之际，北向资金初心不变。Choice数据显示，即使在昨日三大指数均跌逾1%的情况下，北向资金仍净流入了14.23亿元。\n" +
                    "\n" +
                    "2019年12月份以来，A股市场持续上涨，北向资金也持续加仓，期间仅在12月31日净流出1.62亿元，其他交易日均为净流入。整个12月，北向资金累计净流入729.94亿元，创历史月度净流入纪录。2020年1月以来，北向资金还在继续保持着净流入状态，截至1月8日，1月北向资金已累计净流入237.93亿元。\n" +
                    "\n" +
                    "12月份以来北向资金流入情况\n" +
                    "\n" +
                    "创指创近两年新高！A股普涨 北向资金加力净流入\n" +
                    "\n" +
                    "数据来源：东方财富Choice\n" +
                    "\n" +
                    "进入2020年，北向资金偏爱哪些股票？\n" +
                    "\n" +
                    "Choice数据显示，截至1月8日，北向资金持股市值达到了1.45万亿元，共计持有2120只个股。1月份以来北向资金对830只个股进行了加仓，其中对中国建筑、京东方A的加仓股数过亿，分别加仓了2.16亿股、2.10亿元，此外，对紫金矿业、TCL集团的加仓股数超过了5000万股。可以看到，在北向资金加仓股数居前的个股中，除低估值的中国建筑外，北向资金对面板行业的京东方A、TCL集团特别偏爱。\n" +
                    "\n" +
                    "北向资金增持量前十个股\n" +
                    "\n" +
                    "创指创近两年新高！A股普涨 北向资金加力净流入\n" +
                    "\n" +
                    "数据来源 ：东方财富Choice\n" +
                    "\n" +
                    "从对流通股的加仓比例来看，截至1月8日，1月份以来北向资金对中小创个股的加仓也是丝毫不手软，对旭升股份、金石资源的加仓流通股比例居前，分别加仓了3.13%、2.25%。此外，对中国科创、韦尔股份、丽珠集团、百傲化学等个股的加仓流通股比例超过了1%。\n" +
                    "\n" +
                    "北向资金增持流通股比例前十个股\n" +
                    "\n" +
                    "创指创近两年新高！A股普涨 北向资金加力净流入\n" +
                    "\n" +
                    "数据来源：东方财富Choice\n" +
                    "\n" +
                    "今日，在两市高开高走的情况下，北向资金继续大手笔加仓，东方财富网数据显示，半日北向资金加仓金额达到了59.02亿元。\n" +
                    "\n" +
                    "创指创近两年新高！A股普涨 北向资金加力净流入\n" +
                    "\n" +
                    "数据来源：东方财富网\n" +
                    "\n" +
                    "太平洋证券研究院院长黄付生表示，从北向资金配置A股的驱动看，北向资金倾向于在人民币升值时买入A股，在经历了2019年的人民币超跌后，经济周期复苏背景下，人民币币值更加趋向稳中有升，故而即使2020年外资纳入A股比例带来的被动配置效应边际减弱，外资主动买入A股的势头也不会停止，各行业龙头优势将更加显著。\n" +
                    "\n" +
                    "春季行情仍将延续\n" +
                    "\n" +
                    "展望后市，万和证券表示，春季行情仍在演绎，地缘风险对A股影响偏弱。2020年初级行情已经启动并且显示这一轮春季行情或将更长，主要理由有三点：一是基本面趋稳，二是政策面偏暖，三是盈利面偏暖。当前背景下，数据相对空缺，行情演绎主要靠市场情绪及市场预期推动，制造业PMI连续两月位于荣枯线上方，制造业景气回升叠加央行如期降准稳定流动性预期，短期市场情绪稳中有升。\n" +
                    "\n" +
                    "华泰证券表示，从日历效应和宏观数据空窗期的角度考虑，“红包行情”或会延续至春节前，全年来看，指数上行空间或大于下行空间，3000点大概率扎实。\n" +
                    "\n" +
                    "对于2020年A股市场的增量资金，中信证券表示，2020年外资的资金流入会弱于2019年，但仍然是重要力量；场外的产业资本的增持、举牌会抵消解禁带来的潜在减持压力；理财子公司逐步从承接压减规模过渡到新发产品，成为未来不可或缺的增量。2020年A股总资金净流入在8000亿左右，上述多重资金流入在二季度共振的可能较大。",
            "中新经纬客户端1月9日电 今日早盘，大北农(002385)大跌5.24%，报7.60元，成交额332912万元，换手率15.41%，振幅4.99%，量比29.71。\n" +
                    "\n" +
                    "大北农所在的饲料行业，整体跌幅为0.56%。领涨股为正虹科技(000702)，领跌股为大北农(002385)。\n" +
                    "\n" +
                    "资金方面，大北农近5日共流出10343.33万元，今日到此时主力资金总体呈净流出状态，净流出27752.3万元。\n" +
                    "\n" +
                    "该股最近一日(2020年01月08日)融资融券数据为：融资余额89675.62万元，融券余额952.62万股，融资买入23495.07万元，融资净买入10153.43万元。\n" +
                    "\n" +
                    "最新的2019年三季报显示，公司实现营业收入122.23亿元，净利润3.02亿元，每股收益0.07元，市盈率91.34。\n" +
                    "\n" +
                    "机构评级方面，近半年内，3家券商给予增持建议，2家券商给予中性建议。\n" +
                    "\n" +
                    "大北农主营业务为饲料产品的生产、销售和农作物种子产品的培育与推广。最新定期报告显示，该公司股东人数(户)为14.40万户，较上个报告期增加26.32%。",
            "今日上午沪指高开后冲高回落，小幅上涨，受阻于3100点，创指表现较为强势，再创年内新高，互联网保险概念大涨，领涨两市，邦讯技术与银之杰两股涨停，机场航运板块大涨，涨幅居前，华夏航空大涨近7%，软件板块表现活跃，涨幅居前，先进数通等3股涨停，医疗器械服务板块大涨超2%，中珠医疗等3股涨停，5G概念也涨幅居前，安洁科技等两股涨停，中船系、黄金、军工、石油等板块大跌，跌幅居前。\n" +
                    "\n" +
                    "截至中午收盘：沪指涨0.47%，报3081.36点；深指涨1.07%，报10820.96点；创业板指数涨1.75%，报1895.27点。\n" +
                    "\n" +
                    "板块方面：互联网保险、机场航运、软件等板块涨幅居前，中船系、黄金、国防军工等板块跌幅居前。\n" +
                    "\n" +
                    "外围情况：美国三大指数集体收涨，纳指再创收盘历史新高。截至收盘：道指涨0.56%，报28745.09点；纳指涨0.67%，报9129.24点；标普500指数涨0.49%，报3253.05点。美国大型科技股多数收涨，苹果涨1.6%，股价再次突破300美元关口，特斯拉涨近5%，再创收盘历史新高。热门中概股多数收涨，瑞幸咖啡涨超12%，蔚来汽车涨逾4%。\n" +
                    "\n" +
                    "消息面上：1、特朗普：美国将立即对伊朗施加额外的惩罚性经济制裁，不希望使用军事力量。2、国务院召开常务会议，要求全力做好市场保供稳价工作。3、深圳市政府工作报告：争取在创业板注册制改革等方面实施一批先行先试政策。4、农业农村部：2020年将继续安排项目资金用于支持新建、改扩建种猪场、规模猪场。5、商务部：进一步缩减外商投资负面清单，加快推进海南自贸港建设。6、据央视新闻，武汉不明原因的病毒性肺炎疫情病原体初步判定为新型冠状病毒。\n" +
                    "\n" +
                    "\n" +
                    "神光财经观点：今日上午沪指高开后冲高回落，小幅上涨，受阻于3100点，创指表现较为强势，再创年内新高，互联网保险概念大涨，领涨两市，邦讯技术与银之杰两股涨停，机场航运板块大涨，涨幅居前，华夏航空大涨近7%，软件板块表现活跃，涨幅居前，先进数通等3股涨停，医疗器械服务板块大涨超2%，中珠医疗等3股涨停，5G概念也涨幅居前，安洁科技等两股涨停，中船系、黄金、军工、石油等板块大跌，跌幅居前。大盘经过多日上涨之后，目前来到3100点重要关口，虽然短期压力较大，但是市场投资热情已被激发，大家可以逢低买入优质股，耐心持股待涨。",
            "昔日跌停王*ST信威 近期惹投资者注目。原因是公司前段时间发了一个很有意思的公告。这家公司宣布要在境外成立一个以投资5G为主的基金，总规模75亿美金，信威出资26亿美金。该基金的投资方向为：5G/4G、人工智能、云计算、大数据、区块链、物联共享时下最火概念一网打尽。随后经短期筑底后该公司股价在22天的交易时间内出现21个涨停板。\n" +
                    "\n" +
                    "1月9日，*ST信威高开后直线上涨，随后震荡下行，截至发午间收盘报3.85元，跌1.53%\n" +
                    "\n" +
                    "值得注意的是从其被特别处理的*ST帽子投资者就知道这是个有很大风险的股票，它上涨的动力是什么？风险又存在哪些？\n" +
                    "\n" +
                    "数据显示，2019年11月7日该股股价最低下探至1.05元，当日公司发布公告称收到上交所关于*ST信威参与发起设立基金的问询函。之后便展开了筑底反弹的过程。\n" +
                    "\n" +
                    "本轮连续涨停自去年12月16日起，是该股的第三轮连续涨停过程。其曾披露的构成重大资产重组的参与发起设立5G基金事项似乎是大家共同认定的主要上涨动力。而这件事本身似乎并没有那么高的确定性。\n" +
                    "\n" +
                    "其在今年1月4日披露的公告提示了风险，其中之一就是发起设立5G基金风险。公司在公告中表示，公司参与发起设立基金尚未取得相关部门对外投资的批准，尚未取得公司债权人的书面同意和海外运营商原有股东的同意，所需履行的重大资产重组相关程序亦尚未完成，公司参与发起设立基金事项能否成功实施存在重大不确定性。\n" +
                    "\n" +
                    "此外，关于重大资产重组的风险。公司尚未取得乌克兰政府的反垄断审查批复，公司审计报告中无法表示意见所涉及事项尚未解决，尽职调查等相关工作尚未全面开展，交易对象及标的资产股份被冻结，后续工作亦存在一定不确定性，后续不排除终止或变更的可能性。\n" +
                    "\n" +
                    "再加上，因公司2017年度和2018年度经审计的归属于上市公司股东的净利润为负值，公司2018年度被致同会计师事务所（特殊普通合伙出具了无法表示意见的审计报告，公司股票被实施退市风险警示。\n" +
                    "\n" +
                    "上述风险对投资炒作该股的中小投资者形成了重大的不可控性，而近期*ST神城A股、B股终止上市也提醒投资者，参与濒临退市股的炒作风险极高。",
            "中国网财经1月8日讯    近日，曾任创业板发行审核委员会委员的孙小波受贿一案牵涉数家上市公司，光一科技(300356)便是其中一家。\n" +
                    "\n" +
                    "孙小波受贿案判决书显示，2012年5月，拟上市企业光一科技股份有限公司为了IPO申请能通过发审委会议审核，于该公司上会前一天，公司董事长龙昌明在北京金融街附近的“七彩云南”茶馆请托孙小波在评审该公司时给予关照，送给孙小波2.5万欧元。同年10月，光一科技顺利上市。\n" +
                    "\n" +
                    "可惜光一科技上市之后的业绩并不那么如意，从2013年开始，光一科技的净利润经历两年负增长、两年正增长后，在2017年巨亏3.72亿元，2018年扭亏，但扣非后净利润仍然为负，为-1301万元。\n" +
                    "\n" +
                    "公司的投资者们似乎对公司未来也没多少信心，股东高管不间断地减持套现。据媒体统计，自2013年限售股解禁以来，光一科技股东每年都在进行减持套现，累计实施百余次。\n" +
                    "\n" +
                    "与此同时，董事长龙昌明的超高股权质押也让投资者们忧心忡忡，根据东方财富网数据，龙昌明截至2019年12月24日质押股数为2334.5万股，占其持股的比例为98.38%。龙昌明甚至因为质押股份被强制平仓被动减持，2019年8月龙昌明还因为遭遇强制平仓未先披露，吃了证监会的警示函。\n" +
                    "\n" +
                    "对光一科技此次事件的进展，中国网财经将保持进一步关注。",
            "1月7日晚间，昂立教育因董事会决议问题收交易所问询函。\n" +
                    "\n" +
                    "交易所在问询函中指出“公司于2020年1月6日召开董事会，通过了聘任周传有为公司总裁、林涛为公司联席总裁的决议，并有董事就上述高管选任程序的合规性等方面提出异议。请公司说明董事会是否合规以及符合法律规定。”\n" +
                    "\n" +
                    "昂立教育在1月7日晚间的公告显示：昂立教育第十届董事会第十四次会议审议《公司关于聘任公司总裁的议案》《公司关于聘任公司副总裁的议案》，《公司关于聘任公司联席总裁的议案》三项议案，但都遭到了3名董事投反对票。\n" +
                    "\n" +
                    "交易所就反对票意见进行了深度问询。\n" +
                    "\n" +
                    "交大系董事投反对票\n" +
                    "\n" +
                    "1月7日晚间，昂立教育发布公告称，公司第十届董事会第十四次会议审议的三项议案同时遭到了3名董事投反对票，表决结果都是5票赞成，3票反对。\n" +
                    "\n" +
                    "三项议案最终的结果是聘任董事长周传有兼任公司总裁，同时免去公司原总裁林涛的总裁职务；聘任林涛担任公司联席总裁，聘任马鹤波担任公司副总裁，任期均至2022年1月30日。\n" +
                    "\n" +
                    "根据昂立教育披露的公告，董事刘玉文、周思未反对上述三项子议案的理由为：周传有作为公司第一大股东的实际控制人同时也是公司董事长，如兼任总裁，将更大程度对公司的运行施加影响力，不符合相关无实际控制人的约定。另外，议案的表决也不符合《公司章程》第119条关于有关联关系的董事应回避表决的要求。\n" +
                    "\n" +
                    "“《公司关于聘任公司联席总裁的议案》：《公司章程》第124条并无联席总裁这一职务，且该议案不符合提前三日通知的要求；《公司关于聘任公司副总裁的议案》中副总裁应经总裁提名推荐，而本议案通知时仅通过董事长提名。”\n" +
                    "\n" +
                    "独立董事喻军反对上述三项子议案的理由为：三项议案未充分提供资料，关联关系董事未按章程规定予以回避，联席总裁职务的新设及对副总裁的提名违反章程规定。\n" +
                    "\n" +
                    "此番投反对票的刘玉文、周思未均任职于交大系。独立董事喻军则任职于上海远闻律师事务所合伙人律师。\n" +
                    "\n" +
                    "这不是昂立教育第一次收到股东交大系投来的反对票。早在此前，交大系便在上市公司相关议案上表示反对。\n" +
                    "\n" +
                    "这些都要源于昂立教育的目前的股权结构，公司股东持股明细显示，中金系，交大系（包含上海交大控股的一致行动人公司），长甲系分别占公司股权比例为22.72%、20.58%和17.19%。\n" +
                    "\n" +
                    "交易所质疑决议有效性\n" +
                    "\n" +
                    "对于昂立教育的董事会议案，交易所第一时间进行了问询。\n" +
                    "\n" +
                    "交易所要求昂立教育补充披露董事会所履行的具体通知、召开、披露程序，相关程序是否符合相关法律、法规、规范性文件及公司章程的要求，本次董事会决议是否有效；并要求公司披露总裁、联席总裁的推举选任是否符合公司章程的规定。\n" +
                    "\n" +
                    "根据昂立教育的股东股权占比，公司并无实际控制人。\n" +
                    "\n" +
                    "昂立教育此前披露，公司股东中金系、交大系、长甲系三方中任一股东均无法对股东大会的决议产生重要影响，公司各主要股东及其一致行动人之间持股比例差异不大，相互之间均保持独立自主决策权，均无一致行动关系，均不能决定上市公司董事会半数以上成员选任，董事会认为，公司目前无控股股东和无实际控制人。\n" +
                    "\n" +
                    "目前，周传有目前为公司第一大股东中金集团实际控制人且为上市公司董事长。交易所要求昂立教育结合总裁、联席总裁在上市公司经营管理决策中的职责、地位和影响，说明董事长兼任总裁后是否会导致公司实际控制人的变动。并要求中金系、交大系、长甲系分别说明上述经营管理层的变动对公司控制权的影响。\n" +
                    "\n" +
                    "对于股东之间微妙的关系，一位接近昂立教育的知情人士对《证券日报》记者称：“受到校企改革等多方面影响，交大系近两年并不过多插手上市公司相关业务，不合规业务也在剥离，这次投反对票也是因为股东之间有一些矛盾。”\n" +
                    "\n" +
                    "“上市公司已经充分披露了相关信息，并在5个交易日内回复问询函，相关信息以公告披露为准。”对于股东投反对票及上市公司实控人等疑问，昂立教育内部人士对《证券日报》记者回复称。")

        var title = arrayOf("参与濒临退市股的炒作风险极高：*ST信威股价跌停",
            "收评：创指涨2.71%创21个月新高 科技股全线爆发",
            "锐奇股份董事长被曝行贿 上市前后业绩“变脸”",
            "天合光能科创板IPO遭暂缓审议 光伏企业回A不容易",
                    "这些股小市值高增长且滞涨严重 估值跌到个位数",
            "神农科技上市前被曝行贿 上市后虚增营收利润被罚",
            "最新整理! 这些股小市值高增长且滞涨严重(名单)",
            "大事件！国家科技奖将揭晓 多家上市公司有望获奖",
            "暴涨137%的大黑马又疯狂 最大受益者浮出水面",
            "4万元登上龙虎榜！暴涨137%的大黑马又疯狂",
            "创指创近两年新高！A股普涨 北向资金加力净流入",
            "大北农大跌5.24%：近5日资金流出逾1亿元",
            "午评：创指高位震荡涨1.75% 互联网保险概念走强",
            "参与濒临退市股的炒作风险极高:*ST信威跌1.53%",
            "光一科技龙昌明被曝行贿 上市后高比例质押股权",
            "昂立教育总裁改选遇反对 董事会意见现分歧遭问询")

        var say = arrayOf("288","1156","135","225","328","814","114","314","914","854","663","617","612","542","235","125","328")


        var message = ArrayList<MessageNewBean>().apply {
            add(MessageNewBean("1",title[0], content[0], images[0],say[0]))
            add(MessageNewBean("2",title[1], content[1], images[1],say[1]))
            add(MessageNewBean("3",title[2], content[2], images[2],say[2]))
            add(MessageNewBean("4",title[3], content[3], images[3],say[3]))
            add(MessageNewBean("5",title[4], content[4], images[4],say[4]))

            add(MessageNewBean("6",title[6], content[6], images[6],say[6]))
            add(MessageNewBean("7",title[7], content[7], images[7],say[7]))
            add(MessageNewBean("8",title[8], content[8], images[8],say[8]))
            add(MessageNewBean("9",title[9], content[9], images[9],say[9]))
            add(MessageNewBean("10",title[10], content[10], images[10],say[10]))
            add(MessageNewBean("11",title[11], content[11], images[11],say[11]))
            add(MessageNewBean("12",title[12], content[12], images[12],say[12]))
            add(MessageNewBean("13",title[13], content[13], images[13],say[13]))
            add(MessageNewBean("14",title[14], content[14], images[14],say[14]))
            add(MessageNewBean("15",title[15], content[15], images[15],say[15]))

        }


    }

}