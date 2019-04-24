.class Lo/bon;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 492
    const-class v0, Lo/bon;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bon;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 490
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static varargs b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsupportedOperationException;
        }
    .end annotation

    .line 533
    if-nez p1, :cond_0

    .line 535
    const/4 v0, 0x0

    return-object v0

    .line 540
    :cond_0
    :try_start_0
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 542
    :catch_0
    move-exception v2

    .line 544
    sget-object v0, Lo/bon;->a:Ljava/lang/String;

    const-string v1, "Exception in invoke."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 549
    goto :goto_0

    .line 546
    :catch_1
    move-exception v2

    .line 548
    sget-object v0, Lo/bon;->a:Ljava/lang/String;

    const-string v1, "Exception in invoke."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 550
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static varargs b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .line 684
    invoke-static {p0}, Lo/bon;->c(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lo/bon;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 685
    if-nez v1, :cond_0

    .line 687
    const/4 v0, 0x0

    return-object v0

    .line 689
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0, v1, p3}, Lo/bon;->b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/lang/Class<*>;"
        }
    .end annotation

    .line 502
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 504
    const/4 v0, 0x0

    return-object v0

    .line 506
    :cond_0
    const-string v0, "com.huawei.android.os.BuildEx$VERSION"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.huawei.android.immersion.ImmersionStyle"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 508
    const/4 v0, 0x0

    return-object v0

    .line 513
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 515
    :catch_0
    move-exception v2

    .line 517
    sget-object v0, Lo/bon;->a:Ljava/lang/String;

    const-string v1, "className not found."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    const/4 v0, 0x0

    return-object v0
.end method

.method private static varargs c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 563
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 565
    :cond_0
    sget-object v0, Lo/bon;->a:Ljava/lang/String;

    const-string v1, "targetClass is  null pr name is null:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 566
    const/4 v0, 0x0

    return-object v0

    .line 568
    :cond_1
    const-string v0, "getPrimaryColor"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "getSuggestionForgroundColorStyle"

    .line 569
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 571
    const/4 v0, 0x0

    return-object v0

    .line 575
    :cond_2
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 577
    :catch_0
    move-exception v2

    .line 579
    sget-object v0, Lo/bon;->a:Ljava/lang/String;

    const-string v1, "get declared method exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 584
    goto :goto_0

    .line 581
    :catch_1
    move-exception v2

    .line 583
    sget-object v0, Lo/bon;->a:Ljava/lang/String;

    const-string v1, "no such method."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 585
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static d([Ljava/lang/Class;Ljava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/Class<*>;Ljava/lang/Object;I)V"
        }
    .end annotation

    .line 597
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 599
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v0, p0, p2

    goto/16 :goto_0

    .line 601
    :cond_0
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 603
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v0, p0, p2

    goto :goto_0

    .line 605
    :cond_1
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_2

    .line 607
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    aput-object v0, p0, p2

    goto :goto_0

    .line 609
    :cond_2
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_3

    .line 611
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v0, p0, p2

    goto :goto_0

    .line 613
    :cond_3
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    .line 615
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v0, p0, p2

    goto :goto_0

    .line 617
    :cond_4
    instance-of v0, p1, Ljava/lang/Character;

    if-eqz v0, :cond_5

    .line 619
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    aput-object v0, p0, p2

    goto :goto_0

    .line 621
    :cond_5
    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_6

    .line 623
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v0, p0, p2

    goto :goto_0

    .line 625
    :cond_6
    instance-of v0, p1, Ljava/lang/Void;

    if-eqz v0, :cond_7

    .line 627
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    aput-object v0, p0, p2

    goto :goto_0

    .line 629
    :cond_7
    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_8

    .line 631
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    aput-object v0, p0, p2

    goto :goto_0

    .line 635
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    aput-object v0, p0, p2

    .line 637
    :goto_0
    return-void
.end method

.method public static varargs e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 651
    const/4 v1, 0x0

    .line 652
    if-eqz p2, :cond_0

    .line 654
    array-length v2, p2

    .line 655
    new-array v1, v2, [Ljava/lang/Class;

    .line 656
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 658
    aget-object v0, p2, v3

    invoke-static {v1, v0, v3}, Lo/bon;->d([Ljava/lang/Class;Ljava/lang/Object;I)V

    .line 656
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 661
    :cond_0
    invoke-static {p0}, Lo/bon;->c(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p1, v1}, Lo/bon;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 662
    if-nez v2, :cond_1

    .line 664
    const/4 v0, 0x0

    return-object v0

    .line 666
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0, v2, p2}, Lo/bon;->b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
