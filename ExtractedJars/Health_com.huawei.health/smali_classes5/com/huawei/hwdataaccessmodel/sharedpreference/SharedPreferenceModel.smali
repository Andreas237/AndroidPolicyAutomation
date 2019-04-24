.class public Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private encryptType:I

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->encryptType:I

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getEncryptType()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->encryptType:I

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setEncryptType(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->encryptType:I

    .line 36
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->value:Ljava/lang/String;

    .line 52
    return-void
.end method
