.class final Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;
.source "$AutoValue_EarningDetailParcel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private earningId:Ljava/lang/Integer;

.field private earningType:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;-><init>()V

    .line 73
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;->earningId:Ljava/lang/Integer;

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningType()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;->earningType:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$1;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
    .locals 4

    const-string v0, ""

    .line 89
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;->earningId:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " earningId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 92
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;->earningType:Ljava/lang/Integer;

    if-nez v1, :cond_1

    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " earningType"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 95
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 98
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/AutoValue_EarningDetailParcel;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;->earningId:Ljava/lang/Integer;

    .line 99
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;->earningType:Ljava/lang/Integer;

    .line 100
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/AutoValue_EarningDetailParcel;-><init>(II)V

    return-object v0

    .line 96
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public earningId(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;
    .locals 0

    .line 78
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;->earningId:Ljava/lang/Integer;

    return-object p0
.end method

.method public earningType(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;
    .locals 0

    .line 83
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;->earningType:Ljava/lang/Integer;

    return-object p0
.end method
