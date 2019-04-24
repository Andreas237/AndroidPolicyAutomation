.class public final Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;
.super Lcom/huawei/hwCloudJs/api/JsParam;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StartIntentReq"
.end annotation


# static fields
.field public static final TYPE_GETDATA_FORRESULT:I = 0x3ec

.field public static final TYPE_STARTACTIVITY:I = 0x3e9

.field public static final TYPE_STARTACTIVITY_FORRESULT:I = 0x3ea

.field public static final TYPE_STARTINTENTSENDER_FORRESULT:I = 0x3eb


# instance fields
.field private extraFlags:I

.field private fillInIntent:Ljava/lang/String;

.field private flagsMask:I

.field private flagsValues:I

.field private intent:Ljava/lang/String;

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/api/JsParam;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->flagsMask:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->flagsValues:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->extraFlags:I

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;)I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->flagsMask:I

    return v0
.end method

.method static synthetic access$1100(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;)I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->flagsValues:I

    return v0
.end method

.method static synthetic access$1200(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;)I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->extraFlags:I

    return v0
.end method

.method static synthetic access$700(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->intent:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;)I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->type:I

    return v0
.end method

.method static synthetic access$900(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->fillInIntent:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public getExtraFlags()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->extraFlags:I

    return v0
.end method

.method public getFillInIntent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->fillInIntent:Ljava/lang/String;

    return-object v0
.end method

.method public getFlagsMask()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->flagsMask:I

    return v0
.end method

.method public getFlagsValues()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->flagsValues:I

    return v0
.end method

.method public getIntent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->intent:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->type:I

    return v0
.end method

.method public setExtraFlags(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->extraFlags:I

    return-void
.end method

.method public setFillInIntent(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->fillInIntent:Ljava/lang/String;

    return-void
.end method

.method public setFlagsMask(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->flagsMask:I

    return-void
.end method

.method public setFlagsValues(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->flagsValues:I

    return-void
.end method

.method public setIntent(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->intent:Ljava/lang/String;

    return-void
.end method

.method public setType(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$StartIntentReq;->type:I

    return-void
.end method
