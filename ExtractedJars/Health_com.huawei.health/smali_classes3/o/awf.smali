.class Lo/awf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/search/MemberSearchBean;Ljava/lang/String;)V
    .locals 0

    .line 91
    invoke-virtual {p1, p2}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setSubTitle(Ljava/lang/String;)V

    .line 92
    return-void
.end method

.method private a(ILjava/lang/String;Lcom/huawei/health/sns/model/search/MemberSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)Z
    .locals 8

    .line 204
    const/4 v2, 0x0

    .line 205
    const/16 v0, 0x9

    if-ne p1, v0, :cond_3

    .line 207
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserSearchShortPinyin()Ljava/lang/String;

    move-result-object v3

    .line 208
    const-string v0, "\\|"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 211
    const/4 v5, -0x1

    .line 212
    const/4 v6, 0x0

    .line 213
    const/4 v7, 0x0

    :goto_0
    array-length v0, v4

    if-ge v7, v0, :cond_1

    .line 215
    aget-object v6, v4, v7

    .line 216
    invoke-virtual {v6, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    .line 218
    move v5, v7

    .line 219
    goto :goto_1

    .line 213
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 222
    :cond_1
    :goto_1
    if-gez v5, :cond_2

    .line 224
    const/4 v0, 0x0

    return v0

    .line 226
    :cond_2
    invoke-direct {p0, v5, p4}, Lo/awf;->e(ILcom/huawei/health/sns/model/group/GroupMember;)Ljava/lang/String;

    move-result-object v7

    .line 227
    invoke-static {v5}, Lo/avr;->a(I)I

    move-result v0

    invoke-virtual {p3, v7, v6, v0}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setSubTitlePinyinType(Ljava/lang/String;Ljava/lang/String;I)V

    .line 228
    const/4 v2, 0x1

    .line 230
    goto :goto_2

    .line 231
    :cond_3
    const/16 v0, 0xe

    if-ne p1, v0, :cond_4

    .line 233
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/GroupMember;->getSearchShortPinyin()Ljava/lang/String;

    move-result-object v3

    .line 234
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v4

    .line 235
    const/16 v0, 0x8

    invoke-virtual {p3, v4, v3, v0}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setSubTitlePinyinType(Ljava/lang/String;Ljava/lang/String;I)V

    .line 236
    const/4 v2, 0x1

    .line 238
    :cond_4
    :goto_2
    return v2
.end method

.method private a(Lcom/huawei/health/sns/model/search/MemberSearchBean;)Z
    .locals 7

    .line 281
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getSearchKey()Ljava/lang/String;

    move-result-object v2

    .line 282
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getMatchedPinyin()Ljava/lang/String;

    move-result-object v3

    .line 283
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 285
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 289
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 291
    const/4 v0, 0x2

    new-array v5, v0, [I

    .line 292
    invoke-static {v5, v4, v3}, Lo/avr;->a([ILjava/lang/String;Ljava/lang/String;)Z

    move-result v6

    .line 293
    if-eqz v6, :cond_2

    .line 295
    const/4 v0, 0x0

    aget v0, v5, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setMatchIndexCount(II)V

    .line 297
    :cond_2
    return v6
.end method

.method private b(ILcom/huawei/health/sns/model/search/MemberSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 1

    .line 64
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 67
    :pswitch_0
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lo/awf;->a(Lcom/huawei/health/sns/model/search/MemberSearchBean;Ljava/lang/String;)V

    .line 68
    goto :goto_0

    .line 70
    :pswitch_1
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lo/awf;->a(Lcom/huawei/health/sns/model/search/MemberSearchBean;Ljava/lang/String;)V

    .line 71
    goto :goto_0

    .line 73
    :pswitch_2
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/GroupMember;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lo/awf;->a(Lcom/huawei/health/sns/model/search/MemberSearchBean;Ljava/lang/String;)V

    .line 74
    goto :goto_0

    .line 76
    :pswitch_3
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lo/awf;->a(Lcom/huawei/health/sns/model/search/MemberSearchBean;Ljava/lang/String;)V

    .line 77
    .line 81
    :goto_0
    :pswitch_4
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method private c(IILcom/huawei/health/sns/model/search/MemberSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)Z
    .locals 5

    .line 106
    const/4 v1, 0x0

    .line 108
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getSearchKey()Ljava/lang/String;

    move-result-object v2

    .line 109
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    const/4 v0, 0x0

    return v0

    .line 115
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 116
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 118
    invoke-direct {p0, p2, v3, p3, p4}, Lo/awf;->a(ILjava/lang/String;Lcom/huawei/health/sns/model/search/MemberSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v4

    .line 120
    if-nez v4, :cond_1

    .line 122
    const/4 v0, 0x0

    return v0

    .line 124
    :cond_1
    invoke-direct {p0, p3}, Lo/awf;->d(Lcom/huawei/health/sns/model/search/MemberSearchBean;)Z

    move-result v1

    .line 125
    goto :goto_0

    .line 126
    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    .line 128
    invoke-direct {p0, p2, v3, p3, p4}, Lo/awf;->d(ILjava/lang/String;Lcom/huawei/health/sns/model/search/MemberSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v4

    .line 129
    if-nez v4, :cond_3

    .line 131
    const/4 v0, 0x0

    return v0

    .line 133
    :cond_3
    invoke-direct {p0, p3}, Lo/awf;->a(Lcom/huawei/health/sns/model/search/MemberSearchBean;)Z

    move-result v1

    .line 136
    :cond_4
    :goto_0
    return v1
.end method

.method private d(ILjava/lang/String;Lcom/huawei/health/sns/model/search/MemberSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)Z
    .locals 10

    .line 151
    const/4 v2, 0x0

    .line 152
    const/16 v0, 0xa

    if-ne p1, v0, :cond_3

    .line 154
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserSearchFullPinyin()Ljava/lang/String;

    move-result-object v3

    .line 155
    const-string v0, "\\|"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 158
    const/4 v5, -0x1

    .line 159
    const/4 v6, 0x0

    :goto_0
    array-length v0, v4

    if-ge v6, v0, :cond_1

    .line 161
    aget-object v0, v4, v6

    invoke-virtual {v0, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    .line 163
    move v5, v6

    .line 164
    goto :goto_1

    .line 159
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 167
    :cond_1
    :goto_1
    if-gez v5, :cond_2

    .line 169
    const/4 v0, 0x0

    return v0

    .line 173
    :cond_2
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserSearchPinyinFenci()Ljava/lang/String;

    move-result-object v6

    .line 174
    const-string v0, "\\|"

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 175
    aget-object v8, v7, v5

    .line 177
    invoke-direct {p0, v5, p4}, Lo/awf;->e(ILcom/huawei/health/sns/model/group/GroupMember;)Ljava/lang/String;

    move-result-object v9

    .line 178
    invoke-static {v5}, Lo/avr;->a(I)I

    move-result v0

    invoke-virtual {p3, v9, v8, v0}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setSubTitlePinyinType(Ljava/lang/String;Ljava/lang/String;I)V

    .line 179
    const/4 v2, 0x1

    .line 181
    goto :goto_2

    .line 182
    :cond_3
    const/16 v0, 0xf

    if-ne p1, v0, :cond_4

    .line 184
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/GroupMember;->getSearchPinyinFenci()Ljava/lang/String;

    move-result-object v3

    .line 185
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v4

    .line 186
    const/16 v0, 0x8

    invoke-virtual {p3, v4, v3, v0}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setSubTitlePinyinType(Ljava/lang/String;Ljava/lang/String;I)V

    .line 187
    const/4 v2, 0x1

    .line 189
    :cond_4
    :goto_2
    return v2
.end method

.method private d(Lcom/huawei/health/sns/model/search/MemberSearchBean;)Z
    .locals 6

    .line 249
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getSearchKey()Ljava/lang/String;

    move-result-object v1

    .line 250
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getMatchedPinyin()Ljava/lang/String;

    move-result-object v2

    .line 251
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 253
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 257
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 259
    const/4 v4, -0x1

    .line 261
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 263
    if-gez v4, :cond_2

    .line 265
    const/4 v0, 0x0

    return v0

    .line 267
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    .line 269
    invoke-virtual {p1, v4, v5}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setMatchIndexCount(II)V

    .line 270
    const/4 v0, 0x1

    return v0
.end method

.method private e(ILcom/huawei/health/sns/model/group/GroupMember;)Ljava/lang/String;
    .locals 2

    .line 309
    const/4 v1, 0x0

    .line 310
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 313
    :pswitch_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserRemarkName()Ljava/lang/String;

    move-result-object v1

    .line 314
    goto :goto_0

    .line 316
    :pswitch_1
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v1

    .line 317
    goto :goto_0

    .line 319
    :pswitch_2
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getContactName()Ljava/lang/String;

    move-result-object v1

    .line 320
    .line 324
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method d(ILandroid/database/Cursor;Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/search/MemberSearchBean;)Z
    .locals 3

    .line 40
    if-nez p1, :cond_0

    .line 42
    const-string v0, "alias_match_type"

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 43
    invoke-direct {p0, v2, p4, p3}, Lo/awf;->b(ILcom/huawei/health/sns/model/search/MemberSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 44
    invoke-virtual {p4, v2}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setMatchType(I)V

    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_0

    .line 49
    :cond_0
    const-string v0, "alias_pinyin_match_type"

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 50
    invoke-direct {p0, p1, v2, p4, p3}, Lo/awf;->c(IILcom/huawei/health/sns/model/search/MemberSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v1

    .line 52
    :goto_0
    return v1
.end method
