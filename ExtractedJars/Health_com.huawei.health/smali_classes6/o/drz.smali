.class public Lo/drz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/drz$d;
    }
.end annotation


# static fields
.field private static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/drz;->b:Ljava/util/HashMap;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/drz;->d:Ljava/util/ArrayList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    return-void
.end method

.method synthetic constructor <init>(Lo/drz$1;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lo/drz;-><init>()V

    return-void
.end method

.method private c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    return-object v1

    .line 80
    :cond_0
    sget-object v0, Lo/drz;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    invoke-virtual {p0, p1}, Lo/drz;->d(Landroid/content/Context;)V

    .line 85
    :cond_1
    const/4 v3, 0x0

    sget-object v0, Lo/drz;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_3

    .line 86
    sget-object v0, Lo/drz;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 87
    invoke-virtual {p2, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    move-object v1, v2

    .line 89
    goto :goto_1

    .line 85
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 92
    :cond_3
    :goto_1
    return-object v1
.end method

.method public static e()Lo/drz;
    .locals 1

    .line 18
    invoke-static {}, Lo/drz$d;->d()Lo/drz;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    return-object v1

    .line 67
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/drz;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 68
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    sget-object v0, Lo/drz;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 71
    :cond_1
    return-object v1
.end method

.method public d(Landroid/content/Context;)V
    .locals 7

    .line 29
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 30
    return-void

    .line 32
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/multisimsdk/multidevicemanager/R$array;->MMS_AUTH_SUPPORT_OPERATOR:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/multisimsdk/multidevicemanager/R$array;->MMS_AUTH_SUPPORT_NUMBER:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v3

    .line 35
    array-length v0, v3

    array-length v1, v2

    if-eq v0, v1, :cond_1

    .line 36
    return-void

    .line 38
    :cond_1
    array-length v4, v3

    .line 40
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_4

    .line 41
    aget-object v5, v3, v6

    .line 42
    sget-object v0, Lo/drz;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 43
    sget-object v0, Lo/drz;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    :cond_2
    sget-object v0, Lo/drz;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 46
    sget-object v0, Lo/drz;->b:Ljava/util/HashMap;

    aget-object v1, v2, v6

    invoke-virtual {v0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 50
    :cond_4
    return-void
.end method
