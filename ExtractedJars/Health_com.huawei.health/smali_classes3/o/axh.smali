.class public Lo/axh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method

.method private a(Ljava/util/HashMap;Lcom/huawei/health/sns/model/user/User;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Lo/asd;>;Lcom/huawei/health/sns/model/user/User;)V"
        }
    .end annotation

    .line 65
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 67
    :cond_0
    return-void

    .line 69
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getRawContactId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/asd;

    .line 70
    if-nez v1, :cond_2

    .line 72
    return-void

    .line 74
    :cond_2
    invoke-virtual {v1}, Lo/asd;->e()Ljava/lang/String;

    move-result-object v2

    .line 75
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 77
    invoke-virtual {p2, v2}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 78
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    invoke-interface {v0, v2}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/User;->setContactSortPinYin(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 81
    :cond_3
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;Ljava/util/HashMap;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/HashMap<Ljava/lang/String;Lo/asd;>;)V"
        }
    .end annotation

    .line 33
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 35
    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 37
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 39
    invoke-direct {p0, p3, v2}, Lo/axh;->a(Ljava/util/HashMap;Lcom/huawei/health/sns/model/user/User;)V

    .line 40
    goto :goto_0

    .line 42
    :cond_2
    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 44
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 46
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getRawContactId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 48
    invoke-direct {p0, p3, v2}, Lo/axh;->a(Ljava/util/HashMap;Lcom/huawei/health/sns/model/user/User;)V

    .line 50
    :cond_3
    goto :goto_1

    .line 53
    :cond_4
    return-void
.end method
