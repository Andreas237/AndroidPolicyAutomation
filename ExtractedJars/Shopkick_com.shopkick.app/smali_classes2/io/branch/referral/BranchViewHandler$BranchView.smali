.class Lio/branch/referral/BranchViewHandler$BranchView;
.super Ljava/lang/Object;
.source "BranchViewHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/BranchViewHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BranchView"
.end annotation


# static fields
.field private static final USAGE_UNLIMITED:I = -0x1


# instance fields
.field private branchViewAction_:Ljava/lang/String;

.field private branchViewID_:Ljava/lang/String;

.field private num_of_use_:I

.field final synthetic this$0:Lio/branch/referral/BranchViewHandler;

.field private webViewHtml_:Ljava/lang/String;

.field private webViewUrl_:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lio/branch/referral/BranchViewHandler;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    .line 346
    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->this$0:Lio/branch/referral/BranchViewHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, ""

    .line 338
    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->branchViewID_:Ljava/lang/String;

    const-string p1, ""

    .line 339
    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->branchViewAction_:Ljava/lang/String;

    const/4 p1, 0x1

    .line 340
    iput p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->num_of_use_:I

    const-string p1, ""

    .line 341
    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->webViewUrl_:Ljava/lang/String;

    const-string p1, ""

    .line 342
    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->webViewHtml_:Ljava/lang/String;

    .line 348
    :try_start_0
    iput-object p3, p0, Lio/branch/referral/BranchViewHandler$BranchView;->branchViewAction_:Ljava/lang/String;

    .line 349
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchViewID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 350
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchViewID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->branchViewID_:Ljava/lang/String;

    .line 352
    :cond_0
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchViewNumOfUse:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 353
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchViewNumOfUse:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->num_of_use_:I

    .line 355
    :cond_1
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchViewUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 356
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchViewUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->webViewUrl_:Ljava/lang/String;

    .line 358
    :cond_2
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchViewHtml:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 359
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchViewHtml:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->webViewHtml_:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void
.end method

.method synthetic constructor <init>(Lio/branch/referral/BranchViewHandler;Lorg/json/JSONObject;Ljava/lang/String;Lio/branch/referral/BranchViewHandler$1;)V
    .locals 0

    .line 337
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/BranchViewHandler$BranchView;-><init>(Lio/branch/referral/BranchViewHandler;Lorg/json/JSONObject;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lio/branch/referral/BranchViewHandler$BranchView;)Ljava/lang/String;
    .locals 0

    .line 337
    iget-object p0, p0, Lio/branch/referral/BranchViewHandler$BranchView;->branchViewAction_:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1100(Lio/branch/referral/BranchViewHandler$BranchView;)Ljava/lang/String;
    .locals 0

    .line 337
    iget-object p0, p0, Lio/branch/referral/BranchViewHandler$BranchView;->webViewUrl_:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lio/branch/referral/BranchViewHandler$BranchView;Landroid/content/Context;)Z
    .locals 0

    .line 337
    invoke-direct {p0, p1}, Lio/branch/referral/BranchViewHandler$BranchView;->isAvailable(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lio/branch/referral/BranchViewHandler$BranchView;)Ljava/lang/String;
    .locals 0

    .line 337
    iget-object p0, p0, Lio/branch/referral/BranchViewHandler$BranchView;->webViewHtml_:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$302(Lio/branch/referral/BranchViewHandler$BranchView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 337
    iput-object p1, p0, Lio/branch/referral/BranchViewHandler$BranchView;->webViewHtml_:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$800(Lio/branch/referral/BranchViewHandler$BranchView;)Ljava/lang/String;
    .locals 0

    .line 337
    iget-object p0, p0, Lio/branch/referral/BranchViewHandler$BranchView;->branchViewID_:Ljava/lang/String;

    return-object p0
.end method

.method private isAvailable(Landroid/content/Context;)Z
    .locals 1

    .line 367
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p1

    iget-object v0, p0, Lio/branch/referral/BranchViewHandler$BranchView;->branchViewID_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/branch/referral/PrefHelper;->getBranchViewUsageCount(Ljava/lang/String;)I

    move-result p1

    .line 368
    iget v0, p0, Lio/branch/referral/BranchViewHandler$BranchView;->num_of_use_:I

    if-gt v0, p1, :cond_1

    const/4 p1, -0x1

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public updateUsageCount(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 372
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p1

    invoke-virtual {p1, p2}, Lio/branch/referral/PrefHelper;->updateBranchViewUsageCount(Ljava/lang/String;)V

    return-void
.end method
