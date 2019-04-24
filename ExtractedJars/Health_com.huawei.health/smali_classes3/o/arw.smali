.class public final Lo/arw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lo/asb;

.field private static d:Lo/arw;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 63
    new-instance v0, Lo/arw;

    invoke-direct {v0}, Lo/arw;-><init>()V

    sput-object v0, Lo/arw;->d:Lo/arw;

    .line 91
    new-instance v0, Lo/asb;

    invoke-direct {v0}, Lo/asb;-><init>()V

    sput-object v0, Lo/arw;->b:Lo/asb;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/arw;->a:Ljava/util/List;

    .line 79
    return-void
.end method

.method private a(Ljava/util/HashMap;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 314
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 316
    if-eqz p1, :cond_3

    .line 318
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    .line 319
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    .line 320
    const/4 v5, 0x0

    .line 321
    const/4 v6, 0x0

    .line 322
    const/4 v7, 0x0

    .line 324
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v3, :cond_2

    if-ge v8, v4, :cond_2

    .line 326
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 327
    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 328
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 330
    invoke-virtual {p1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 332
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 335
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-le v0, v1, :cond_1

    .line 337
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 343
    :cond_0
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 324
    :cond_1
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 347
    :cond_2
    goto :goto_2

    .line 350
    :cond_3
    invoke-interface {v2, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 352
    :goto_2
    return-object v2
.end method

.method private a(Ljava/util/List;Ljava/util/HashMap;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 286
    const/4 v2, 0x0

    .line 288
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 291
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 293
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 294
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 296
    invoke-direct {p0, p2, v3, v4}, Lo/arw;->a(Ljava/util/HashMap;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 299
    :cond_0
    return-object v2
.end method

.method public static a()Lo/arw;
    .locals 1

    .line 88
    sget-object v0, Lo/arw;->d:Lo/arw;

    return-object v0
.end method

.method public static c()Lo/asb;
    .locals 1

    .line 95
    sget-object v0, Lo/arw;->b:Lo/asb;

    return-object v0
.end method

.method private e()Ljava/util/HashMap;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 257
    new-instance v2, Lo/bce;

    invoke-direct {v2}, Lo/bce;-><init>()V

    .line 258
    const-string v0, "id"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Lo/bce;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 259
    const-string v0, "version"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Lo/bce;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 260
    const/4 v5, 0x0

    .line 261
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 263
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 264
    const-string v0, "#"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 265
    const-string v0, "#"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 266
    array-length v8, v6

    .line 267
    array-length v9, v7

    .line 268
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v8, :cond_0

    if-ge v10, v9, :cond_0

    .line 270
    aget-object v0, v6, v10

    aget-object v1, v7, v10

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 273
    :cond_0
    return-object v5
.end method


# virtual methods
.method public a(J)Z
    .locals 5

    .line 237
    const/4 v2, 0x0

    .line 238
    iget-object v0, p0, Lo/arw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/user/User;

    .line 240
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    .line 242
    const/4 v2, 0x1

    .line 243
    goto :goto_1

    .line 245
    :cond_0
    goto :goto_0

    .line 247
    :cond_1
    :goto_1
    return v2
.end method

.method public b()V
    .locals 1

    .line 226
    iget-object v0, p0, Lo/arw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 227
    return-void
.end method

.method public c(Ljava/util/Map;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;>;"
        }
    .end annotation

    .line 156
    const/4 v1, 0x0

    .line 157
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 159
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 160
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 161
    const/4 v3, 0x0

    .line 162
    const/4 v4, 0x0

    .line 163
    const/4 v5, 0x0

    .line 165
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    new-instance v5, Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;

    invoke-direct {v5}, Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;-><init>()V

    .line 168
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 169
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 170
    iput-object v4, v5, Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;->phoneDigest_:Ljava/lang/String;

    .line 171
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 175
    :cond_0
    return-object v1
.end method

.method public d(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 107
    invoke-direct {p0}, Lo/arw;->e()Ljava/util/HashMap;

    move-result-object v1

    .line 109
    invoke-direct {p0, p1, v1}, Lo/arw;->a(Ljava/util/List;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/health/sns/model/user/User;)V
    .locals 2

    .line 212
    if-eqz p1, :cond_0

    .line 214
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/arw;->a(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 216
    iget-object v0, p0, Lo/arw;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    :cond_0
    return-void
.end method

.method public e(Ljava/util/HashMap;Ljava/util/List;)Ljava/util/HashMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Lo/asd;>;Ljava/util/List<Ljava/lang/String;>;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 118
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 119
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 121
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    const/4 v6, 0x0

    .line 126
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v2, :cond_2

    .line 128
    invoke-interface {p2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 129
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/asd;

    .line 130
    if-eqz v6, :cond_1

    .line 132
    invoke-virtual {v6}, Lo/asd;->a()Ljava/util/List;

    move-result-object v4

    .line 133
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 135
    invoke-virtual {v1, v9, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    goto :goto_1

    .line 137
    :cond_0
    invoke-virtual {v6}, Lo/asd;->d()Ljava/util/List;

    move-result-object v5

    .line 138
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 140
    invoke-virtual {v1, v9, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    goto :goto_2

    .line 126
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 145
    :cond_2
    return-object v1
.end method

.method public e(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 186
    const/4 v2, 0x0

    .line 187
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    .line 188
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 190
    :cond_0
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 191
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 192
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 193
    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    .line 194
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 196
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 197
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 194
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 199
    :cond_1
    new-instance v6, Lo/bce;

    invoke-direct {v6}, Lo/bce;-><init>()V

    .line 200
    const-string v0, "id"

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lo/bce;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 201
    const-string v0, "version"

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lo/bce;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 203
    :cond_2
    return-void
.end method
