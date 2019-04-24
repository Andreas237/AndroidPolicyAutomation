.class public Lo/bht;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bht$a;,
        Lo/bht$c;,
        Lo/bht$d;
    }
.end annotation


# static fields
.field private static d:Lo/bht;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Lo/bht;->c:Landroid/content/Context;

    .line 100
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/bht;
    .locals 2

    .line 103
    sget-object v0, Lo/bht;->d:Lo/bht;

    if-nez v0, :cond_0

    .line 104
    new-instance v0, Lo/bht;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bht;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/bht;->d:Lo/bht;

    .line 106
    :cond_0
    sget-object v0, Lo/bht;->d:Lo/bht;

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)J
    .locals 10

    .line 1120
    new-instance v4, Ljava/util/GregorianCalendar;

    invoke-direct {v4}, Ljava/util/GregorianCalendar;-><init>()V

    .line 1121
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1122
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 1124
    :cond_1
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1125
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 1126
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 1128
    :try_start_0
    invoke-virtual {v5, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    move-object v6, v0

    .line 1129
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 1132
    goto :goto_0

    .line 1130
    :catch_0
    move-exception v8

    .line 1131
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1133
    :goto_0
    const/4 v0, 0x5

    const/4 v1, 0x7

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 1134
    const/4 v0, 0x5

    const/4 v1, 0x7

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 1135
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1136
    invoke-virtual {v4, v6}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1137
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1138
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1139
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1140
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_1

    .line 1142
    :cond_2
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->getActualMinimum(I)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 1143
    invoke-virtual {v4, v7}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1144
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1145
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1146
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1147
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1148
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1150
    :goto_1
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(Ljava/lang/String;)J
    .locals 7

    .line 1162
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1163
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1164
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 1166
    :try_start_0
    invoke-virtual {v4, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 1169
    goto :goto_0

    .line 1167
    :catch_0
    move-exception v6

    .line 1168
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1170
    :goto_0
    new-instance v6, Ljava/util/GregorianCalendar;

    invoke-direct {v6}, Ljava/util/GregorianCalendar;-><init>()V

    .line 1171
    invoke-virtual {v6, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1172
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1173
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1174
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1175
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1176
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private d(Ljava/util/List;J)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;J)Lcom/huawei/health/sns/model/group/GroupMember;"
        }
    .end annotation

    .line 499
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 500
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, p2

    if-nez v0, :cond_0

    .line 501
    return-object v3

    .line 503
    :cond_0
    goto :goto_0

    .line 504
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 1081
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1082
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 1083
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 1085
    :try_start_0
    invoke-virtual {v4, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    move-object v5, v0

    .line 1086
    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1089
    goto :goto_0

    .line 1087
    :catch_0
    move-exception v7

    .line 1088
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1090
    :goto_0
    new-instance v7, Ljava/util/GregorianCalendar;

    invoke-direct {v7}, Ljava/util/GregorianCalendar;-><init>()V

    .line 1091
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 1092
    invoke-virtual {v7, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1093
    invoke-virtual {v7}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    const/4 v1, 0x7

    invoke-virtual {v7, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 1094
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1095
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1096
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1098
    new-instance v8, Ljava/util/GregorianCalendar;

    invoke-direct {v8}, Ljava/util/GregorianCalendar;-><init>()V

    .line 1099
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 1100
    invoke-virtual {v8, v6}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1101
    invoke-virtual {v8}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    const/4 v1, 0x7

    invoke-virtual {v8, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 1102
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1103
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1104
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1106
    const/4 v0, 0x3

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {v8, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 1107
    const/4 v0, 0x1

    return v0

    .line 1109
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)J
    .locals 10

    .line 1038
    new-instance v4, Ljava/util/GregorianCalendar;

    invoke-direct {v4}, Ljava/util/GregorianCalendar;-><init>()V

    .line 1039
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1040
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 1042
    :cond_1
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1043
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 1044
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 1046
    :try_start_0
    invoke-virtual {v5, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    move-object v6, v0

    .line 1047
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 1050
    goto :goto_0

    .line 1048
    :catch_0
    move-exception v8

    .line 1049
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1051
    :goto_0
    invoke-static {p0, p1}, Lo/bht;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    .line 1052
    if-eqz v8, :cond_2

    .line 1053
    invoke-virtual {v4, v6}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1054
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1055
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1056
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1057
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_1

    .line 1059
    :cond_2
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 1060
    invoke-virtual {v4, v7}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1061
    invoke-virtual {v4}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    const/4 v1, 0x7

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 1062
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1063
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1064
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1065
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1067
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 1069
    invoke-virtual {v4}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    sub-int/2addr v0, v9

    const/4 v1, 0x5

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 1071
    :goto_1
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 307
    const-string v1, ""

    .line 308
    if-eqz p2, :cond_3

    .line 309
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getEndTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p3, v0}, Lo/bht;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_activity_social_is_over:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 312
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getBeginTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p3, v0}, Lo/bht;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 314
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_underway:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 317
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getLastTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p3, v0}, Lo/bht;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 319
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail_activity_time_abort:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 321
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_sign_up:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 325
    :cond_3
    :goto_0
    return-object v1
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 173
    const-string v4, ""

    .line 174
    const/4 v5, 0x0

    .line 176
    const-string v0, "healthgroup"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".txt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 177
    if-eqz v5, :cond_0

    .line 178
    invoke-virtual {v5}, Ljava/io/InputStream;->available()I

    move-result v6

    .line 179
    new-array v7, v6, [B

    .line 180
    invoke-virtual {v5, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    .line 181
    if-lez v8, :cond_0

    .line 182
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v0

    .line 188
    :cond_0
    if-eqz v5, :cond_2

    .line 190
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 193
    goto/16 :goto_1

    .line 191
    :catch_0
    move-exception v6

    .line 192
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    goto :goto_1

    .line 185
    :catch_1
    move-exception v6

    .line 186
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 188
    if-eqz v5, :cond_2

    .line 190
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 193
    goto :goto_1

    .line 191
    :catch_2
    move-exception v6

    .line 192
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    goto :goto_1

    .line 188
    :catchall_0
    move-exception v9

    if-eqz v5, :cond_1

    .line 190
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 193
    goto :goto_0

    .line 191
    :catch_3
    move-exception v10

    .line 192
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :cond_1
    :goto_0
    throw v9

    .line 196
    :cond_2
    :goto_1
    return-object v4
.end method

.method public a()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/util/Map<Ljava/lang/Long;Landroid/graphics/Bitmap;>;>;"
        }
    .end annotation

    .line 234
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 235
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 237
    const-wide v0, 0x5d471fdcb4e9480L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_6"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 239
    const-wide v0, 0x5d471fdcb4e9481L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_1"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    const-wide v0, 0x5d471fdcb4e9482L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_2"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    const-wide v0, 0x5d471fdcb4e9483L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_3"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    const-wide v0, 0x5d471fdcb4e9484L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_4"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    const-wide v0, 0x5d471fdcb4e9485L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_5"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    const-wide v0, 0x5d471fdcb4e9486L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_7"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    const-wide v0, 0x5d471fdcb4e9487L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_8"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 253
    const-wide v0, 0x5d471fdcb4e9488L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_9"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 255
    const-wide v0, 0x5d471fdcb4e9489L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_10"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    const-wide v0, 0x5d471fdcb4e948aL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_11"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    const-wide v0, 0x5d471fdcb4e948bL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_12"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 261
    const-wide v0, 0x5d471fdcb4e948cL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_13"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    const-wide v0, 0x5d471fdcb4e948dL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_14"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    const-wide v0, 0x5d471fdcb4e948eL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "pic_15"

    invoke-virtual {p0, v1}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    return-object v2
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 940
    new-instance v0, Lo/bht$d;

    invoke-direct {v0}, Lo/bht$d;-><init>()V

    .line 941
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 942
    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 429
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processGroupUserInfon start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 431
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 432
    if-eqz p1, :cond_0

    .line 433
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 434
    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 437
    :cond_0
    if-eqz p2, :cond_1

    .line 438
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 439
    invoke-interface {v5, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 442
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 443
    if-nez v7, :cond_2

    .line 444
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processGroupUserInfo HealthGroupRank item == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    goto :goto_0

    .line 447
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHuid()J

    move-result-wide v8

    .line 449
    invoke-direct {p0, v5, v8, v9}, Lo/bht;->d(Ljava/util/List;J)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v10

    .line 450
    if-nez v10, :cond_3

    .line 451
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processGroupUserInfo member == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    goto :goto_0

    .line 454
    :cond_3
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 455
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setHeadImgUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 456
    :cond_4
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 457
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setHeadImgUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 458
    :cond_5
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 459
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setHeadImgUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 461
    :cond_6
    const-string v0, ""

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setHeadImgUrl(Ljava/lang/String;)V

    .line 464
    :goto_1
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 465
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setNickName(Ljava/lang/String;)V

    goto :goto_2

    .line 467
    :cond_7
    const-string v0, ""

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setNickName(Ljava/lang/String;)V

    .line 491
    :goto_2
    goto/16 :goto_0

    .line 492
    :cond_8
    const/4 v0, 0x0

    invoke-interface {p3, v0, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 493
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 335
    const/4 v4, 0x0

    .line 336
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 337
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 339
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 340
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 341
    const/4 v4, 0x1

    .line 345
    :cond_0
    goto :goto_0

    .line 343
    :catch_0
    move-exception v6

    .line 344
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataCompare:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    :goto_0
    return v4
.end method

.method public b(I)Ljava/lang/String;
    .locals 8

    .line 1206
    div-int/lit16 v4, p1, 0xe10

    .line 1207
    rem-int/lit16 v0, p1, 0xe10

    div-int/lit8 v5, v0, 0x3c

    .line 1208
    rem-int/lit8 v6, p1, 0x3c

    .line 1209
    const-string v0, "%02d:%02d:%02d"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1210
    return-object v7
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x3
    .end annotation

    .line 112
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGMTtoLocal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 114
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "date is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    const/4 v0, 0x0

    return-object v0

    .line 117
    :cond_0
    const/4 v4, 0x0

    .line 118
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "before GMTtoLocal "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 123
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 124
    const v7, 0x10010

    .line 125
    invoke-static {v6, v7}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 126
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "after GMTtoLocal "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    goto :goto_0

    .line 127
    :catch_0
    move-exception v6

    .line 128
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGMTtoLocal(),Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    :goto_0
    return-object v4
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 156
    const-string v4, ""

    .line 158
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 159
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 160
    invoke-static {v7, p2}, Lo/cnk;->d(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 163
    goto :goto_0

    .line 161
    :catch_0
    move-exception v5

    .line 162
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u65e5\u671f\u8f6c\u6362\u9519\u8bef\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_0
    return-object v4
.end method

.method public b(JJLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 12

    .line 670
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, p3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", rankType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 671
    new-instance v10, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    invoke-direct {v10}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;-><init>()V

    .line 674
    new-instance v11, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v11}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 675
    invoke-virtual {v11, p1, p2}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 676
    move-wide v0, p3

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 677
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 678
    const-string v0, "riding"

    move-object/from16 v1, p5

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 679
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    goto :goto_0

    .line 683
    :cond_0
    const-string v0, "swimming"

    move-object/from16 v1, p5

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 684
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    goto :goto_0

    .line 688
    :cond_1
    const-string v0, "run"

    move-object/from16 v1, p5

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 689
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    goto :goto_0

    .line 695
    :cond_2
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    goto :goto_0

    .line 700
    :cond_3
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 707
    :goto_0
    iget-object v0, p0, Lo/bht;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/bht$5;

    move-object v2, p0

    move-object/from16 v3, p6

    move-object/from16 v4, p5

    move-object v5, v10

    move-wide v6, p1

    move-wide v8, p3

    invoke-direct/range {v1 .. v9}, Lo/bht$5;-><init>(Lo/bht;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;JJ)V

    invoke-virtual {v0, v11, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 825
    return-void

    :array_0
    .array-data 4
        0x9c42
        0xa4a8
    .end array-data

    :array_1
    .array-data 4
        0x9c42
        0xa4da
    .end array-data

    :array_2
    .array-data 4
        0x9c42
        0xa476
    .end array-data

    :array_3
    .array-data 4
        0x9c42
    .end array-data

    :array_4
    .array-data 4
        0x9c42
        0xa476
    .end array-data
.end method

.method public b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 905
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upstickSelfAndSetRankNumb start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 906
    if-nez p1, :cond_0

    .line 907
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthGroupRankList == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 908
    return-void

    .line 911
    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 912
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 913
    if-nez v5, :cond_1

    .line 914
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthGroupRank == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 915
    goto :goto_1

    .line 917
    :cond_1
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setRankNumb(I)V

    .line 911
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 921
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_3

    .line 922
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthGroupRankList.size() <= 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 923
    return-void

    .line 927
    :cond_3
    const/4 v4, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_5

    .line 928
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHuid()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 929
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 930
    goto :goto_3

    .line 927
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 933
    :cond_5
    :goto_3
    return-void
.end method

.method public b([Ljava/lang/String;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 514
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 515
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 516
    if-eqz p2, :cond_0

    .line 517
    move-object/from16 v0, p2

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 520
    :cond_0
    move-object v6, p1

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_6

    aget-object v9, v6, v8

    .line 522
    const-wide/16 v10, 0x0

    .line 524
    :try_start_0
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v10, v0

    .line 527
    goto :goto_1

    .line 525
    :catch_0
    move-exception v12

    .line 526
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processEventUserInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    :goto_1
    invoke-direct {p0, v5, v10, v11}, Lo/bht;->d(Ljava/util/List;J)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v12

    .line 529
    if-nez v12, :cond_1

    .line 530
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processEventUserInfo member == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    goto/16 :goto_4

    .line 533
    :cond_1
    new-instance v13, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    invoke-direct {v13}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;-><init>()V

    .line 534
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 535
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    goto :goto_2

    .line 536
    :cond_2
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 537
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    goto :goto_2

    .line 538
    :cond_3
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 539
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    goto :goto_2

    .line 541
    :cond_4
    const-string v0, ""

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setPhoto(Ljava/lang/String;)V

    .line 544
    :goto_2
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 545
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    goto :goto_3

    .line 547
    :cond_5
    const-string v0, ""

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setNickName(Ljava/lang/String;)V

    .line 549
    :goto_3
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->setHuid(Ljava/lang/Long;)V

    .line 550
    invoke-interface {v4, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 520
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 576
    :cond_6
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 577
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 10

    .line 276
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 278
    :cond_0
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "curDate or endDate is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    const/4 v0, -0x1

    return v0

    .line 281
    :cond_1
    const/4 v4, -0x1

    .line 282
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 283
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 284
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 286
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    .line 287
    invoke-virtual {v6, p3}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    .line 288
    invoke-virtual {v6, p2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v9

    .line 289
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cur: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "end: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "start: "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 291
    const/4 v4, 0x0

    goto :goto_0

    .line 292
    :cond_2
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_3

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_3

    .line 293
    const/4 v4, 0x1

    goto :goto_0

    .line 294
    :cond_3
    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_4

    .line 295
    const/4 v4, -0x1

    .line 299
    :cond_4
    :goto_0
    goto :goto_1

    .line 297
    :catch_0
    move-exception v7

    .line 298
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGMTtoLocal(),Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    :goto_1
    return v4
.end method

.method public c(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 9

    .line 205
    const/4 v4, 0x0

    .line 206
    const/4 v5, 0x0

    .line 208
    const-string v0, "healthgroup"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 209
    if-eqz v5, :cond_0

    .line 210
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    .line 212
    :cond_0
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "inputStream is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lo/bht;->c:Landroid/content/Context;

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lo/bht;->c:Landroid/content/Context;

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 218
    :goto_0
    if-eqz v5, :cond_2

    .line 220
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 223
    goto/16 :goto_2

    .line 221
    :catch_0
    move-exception v6

    .line 222
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    goto :goto_2

    .line 215
    :catch_1
    move-exception v6

    .line 216
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 218
    if-eqz v5, :cond_2

    .line 220
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 223
    goto :goto_2

    .line 221
    :catch_2
    move-exception v6

    .line 222
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    goto :goto_2

    .line 218
    :catchall_0
    move-exception v7

    if-eqz v5, :cond_1

    .line 220
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 223
    goto :goto_1

    .line 221
    :catch_3
    move-exception v8

    .line 222
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    :cond_1
    :goto_1
    throw v7

    .line 226
    :cond_2
    :goto_2
    return-object v4
.end method

.method public c(Ljava/util/List;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 587
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processEventUserInfo  start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 589
    :cond_0
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processEventUserInfo  groupUserRankList isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    return-void

    .line 592
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 594
    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 597
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 598
    if-eqz p2, :cond_2

    .line 599
    invoke-interface {v5, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 603
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 605
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 606
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processEventUserInfo GroupUserRank null == item"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    goto :goto_0

    .line 609
    :cond_3
    const-wide/16 v8, 0x0

    .line 611
    :try_start_0
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v8, v0

    .line 614
    goto :goto_1

    .line 612
    :catch_0
    move-exception v10

    .line 613
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processEventUserInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    :goto_1
    invoke-direct {p0, v5, v8, v9}, Lo/bht;->d(Ljava/util/List;J)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v10

    .line 617
    if-nez v10, :cond_4

    .line 618
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processEventUserInfo member == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    goto :goto_0

    .line 621
    :cond_4
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 622
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    goto :goto_2

    .line 623
    :cond_5
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 624
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    goto :goto_2

    .line 625
    :cond_6
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 626
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    goto :goto_2

    .line 628
    :cond_7
    const-string v0, ""

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setPhotoUrl(Ljava/lang/String;)V

    .line 631
    :goto_2
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 632
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    goto :goto_3

    .line 634
    :cond_8
    const-string v0, ""

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setNickName(Ljava/lang/String;)V

    .line 657
    :goto_3
    goto/16 :goto_0

    .line 658
    :cond_9
    const/4 v0, 0x0

    invoke-interface {p3, v0, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 659
    return-void
.end method

.method public d()J
    .locals 8

    .line 965
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 966
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 967
    move-object v0, v7

    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v7, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    invoke-virtual {v7, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 969
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 955
    new-instance v0, Lo/bht$a;

    invoke-direct {v0}, Lo/bht$a;-><init>()V

    .line 956
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 957
    return-void
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 139
    const-string v4, ""

    .line 141
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 142
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 143
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-static {v7, v0}, Lo/cnk;->d(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 146
    goto :goto_0

    .line 144
    :catch_0
    move-exception v5

    .line 145
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u65e5\u671f\u8f6c\u6362\u9519\u8bef\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :goto_0
    return-object v4
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V
    .locals 5

    .line 359
    if-eqz p1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p3, :cond_1

    .line 360
    :cond_0
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadRoundPic params is empty."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    return-void

    .line 363
    :cond_1
    int-to-float v0, p4

    invoke-static {p1, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v4, v0

    .line 364
    invoke-virtual {p3}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lo/bht$3;

    invoke-direct {v1, p0, p3, v4}, Lo/bht$3;-><init>(Lo/bht;Landroid/widget/ImageView;F)V

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lo/bht$1;

    invoke-direct {v1, p0}, Lo/bht$1;-><init>(Lo/bht;)V

    .line 408
    invoke-virtual {v0, p3, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;Lcom/squareup/picasso/Callback;)V

    .line 419
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 947
    new-instance v0, Lo/bht$c;

    invoke-direct {v0}, Lo/bht$c;-><init>()V

    .line 948
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 949
    return-void
.end method

.method public g(Ljava/lang/String;)J
    .locals 7

    .line 1188
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1189
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1190
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 1192
    :try_start_0
    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 1195
    goto :goto_0

    .line 1193
    :catch_0
    move-exception v6

    .line 1194
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1196
    :goto_0
    new-instance v6, Ljava/util/GregorianCalendar;

    invoke-direct {v6}, Ljava/util/GregorianCalendar;-><init>()V

    .line 1197
    invoke-virtual {v6, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1198
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1199
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1200
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1201
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1202
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method
