.class public abstract Lo/avu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Landroid/content/ContentResolver;

.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/avu;->c:Ljava/lang/String;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/avu;->b:Ljava/lang/String;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/avu;->e:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/avu;->a:Landroid/content/ContentResolver;

    .line 55
    sget v0, Lcom/huawei/android/sns/R$string;->sns_search_sub_tips_text_user_nickname:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avu;->c:Ljava/lang/String;

    .line 56
    sget v0, Lcom/huawei/android/sns/R$string;->sns_search_sub_tips_text_contact:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avu;->b:Ljava/lang/String;

    .line 57
    sget v0, Lcom/huawei/android/sns/R$string;->sns_search_sub_tips_text_user_account:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avu;->e:Ljava/lang/String;

    .line 58
    return-void
.end method


# virtual methods
.method abstract a(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    .line 181
    const-string v0, " and alias_match_type=0"

    .line 182
    return-object v0
.end method

.method protected b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 170
    invoke-static {p1}, Lo/bqz;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 171
    return-object v0
.end method

.method protected b(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z
    .locals 11

    .line 123
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSearchFullPinyin()Ljava/lang/String;

    move-result-object v1

    .line 124
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getKeyColorText()Ljava/lang/String;

    move-result-object v2

    .line 125
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 131
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 132
    const-string v0, "\\|"

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 133
    const/4 v5, 0x0

    .line 134
    const/4 v6, 0x0

    :goto_0
    array-length v0, v4

    if-ge v6, v0, :cond_3

    .line 136
    aget-object v0, v4, v6

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    move v5, v6

    .line 139
    goto :goto_1

    .line 134
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 142
    :cond_3
    :goto_1
    invoke-static {v5}, Lo/avr;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchType(I)V

    .line 145
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSearchPinyinFenci()Ljava/lang/String;

    move-result-object v6

    .line 146
    const-string v0, "\\|"

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 147
    aget-object v8, v7, v5

    .line 149
    const/4 v0, 0x2

    new-array v9, v0, [I

    .line 150
    invoke-static {v9, v3, v8}, Lo/avr;->a([ILjava/lang/String;Ljava/lang/String;)Z

    move-result v10

    .line 151
    if-eqz v10, :cond_4

    .line 153
    const/4 v0, 0x0

    aget v0, v9, v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchIndex(I)V

    .line 154
    const/4 v0, 0x1

    aget v0, v9, v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchCount(I)V

    .line 155
    invoke-virtual {p0, p1}, Lo/avu;->a(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    .line 157
    :cond_4
    return v10
.end method

.method protected c(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z
    .locals 8

    .line 80
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSearchShortPinyin()Ljava/lang/String;

    move-result-object v1

    .line 81
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getKeyColorText()Ljava/lang/String;

    move-result-object v2

    .line 82
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 88
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 89
    const-string v0, "\\|"

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 90
    const/4 v5, -0x1

    .line 92
    const/4 v6, -0x1

    .line 93
    const/4 v7, 0x0

    :goto_0
    array-length v0, v4

    if-ge v7, v0, :cond_3

    .line 95
    aget-object v0, v4, v7

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 96
    const/4 v0, -0x1

    if-le v5, v0, :cond_2

    .line 98
    move v6, v7

    .line 99
    goto :goto_1

    .line 93
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 103
    :cond_3
    :goto_1
    if-gez v6, :cond_4

    .line 105
    const/4 v0, 0x0

    return v0

    .line 107
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    .line 108
    invoke-static {v6}, Lo/avr;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchType(I)V

    .line 109
    invoke-virtual {p1, v5}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchIndex(I)V

    .line 110
    invoke-virtual {p1, v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchCount(I)V

    .line 111
    invoke-virtual {p0, p1}, Lo/avu;->a(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    .line 112
    const/4 v0, 0x1

    return v0
.end method

.method protected d(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z
    .locals 3

    .line 193
    const/4 v1, 0x0

    .line 194
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSearchType()I

    move-result v2

    .line 196
    const/4 v0, 0x1

    if-ne v2, v0, :cond_0

    .line 198
    invoke-virtual {p0, p1}, Lo/avu;->c(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z

    move-result v1

    goto :goto_0

    .line 200
    :cond_0
    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 202
    invoke-virtual {p0, p1}, Lo/avu;->b(Lcom/huawei/health/sns/model/search/SNSSearchBean;)Z

    move-result v1

    .line 205
    :cond_1
    :goto_0
    return v1
.end method

.method protected e()Ljava/lang/String;
    .locals 2

    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    const-string v0, "user_sort_pinyin ASC"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
