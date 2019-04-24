.class Lo/aow$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private c:Lorg/json/JSONObject;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 444
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 446
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    return-void
.end method

.method synthetic constructor <init>(Lo/aow$2;)V
    .locals 0

    .line 444
    invoke-direct {p0}, Lo/aow$e;-><init>()V

    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 1

    .line 640
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method a(J)Lo/aow$e;
    .locals 3

    .line 455
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "assist_id"

    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 460
    goto :goto_0

    .line 457
    :catch_0
    move-exception v2

    .line 459
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    :goto_0
    return-object p0
.end method

.method a(Ljava/lang/String;)Lo/aow$e;
    .locals 3

    .line 509
    if-nez p1, :cond_0

    .line 511
    return-object p0

    .line 516
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "from_pkg"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 521
    goto :goto_0

    .line 518
    :catch_0
    move-exception v2

    .line 520
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    :goto_0
    return-object p0
.end method

.method b(I)Lo/aow$e;
    .locals 3

    .line 533
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "link_seq"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 538
    goto :goto_0

    .line 535
    :catch_0
    move-exception v2

    .line 537
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 540
    :goto_0
    return-object p0
.end method

.method b(J)Lo/aow$e;
    .locals 3

    .line 472
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "user_id"

    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 477
    goto :goto_0

    .line 474
    :catch_0
    move-exception v2

    .line 476
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    :goto_0
    return-object p0
.end method

.method b(Ljava/lang/String;)Lo/aow$e;
    .locals 3

    .line 599
    if-nez p1, :cond_0

    .line 601
    return-object p0

    .line 606
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "menu_id"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 611
    goto :goto_0

    .line 608
    :catch_0
    move-exception v2

    .line 610
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 613
    :goto_0
    return-object p0
.end method

.method c(J)Lo/aow$e;
    .locals 3

    .line 550
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "chat_user_id"

    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 555
    goto :goto_0

    .line 552
    :catch_0
    move-exception v2

    .line 554
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 557
    :goto_0
    return-object p0
.end method

.method d(J)Lo/aow$e;
    .locals 3

    .line 567
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "card_user_id"

    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 572
    goto :goto_0

    .line 569
    :catch_0
    move-exception v2

    .line 571
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    :goto_0
    return-object p0
.end method

.method d(Ljava/lang/String;)Lo/aow$e;
    .locals 3

    .line 487
    if-nez p1, :cond_0

    .line 489
    return-object p0

    .line 494
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "msg_id"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 499
    goto :goto_0

    .line 496
    :catch_0
    move-exception v2

    .line 498
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    :goto_0
    return-object p0
.end method

.method e(J)Lo/aow$e;
    .locals 3

    .line 584
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "friend_id"

    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 589
    goto :goto_0

    .line 586
    :catch_0
    move-exception v2

    .line 588
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 591
    :goto_0
    return-object p0
.end method

.method e(Ljava/lang/String;)Lo/aow$e;
    .locals 3

    .line 621
    if-nez p1, :cond_0

    .line 623
    return-object p0

    .line 628
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/aow$e;->c:Lorg/json/JSONObject;

    const-string v1, "menu_name"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 633
    goto :goto_0

    .line 630
    :catch_0
    move-exception v2

    .line 632
    invoke-static {}, Lo/aow;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "create json exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 635
    :goto_0
    return-object p0
.end method
