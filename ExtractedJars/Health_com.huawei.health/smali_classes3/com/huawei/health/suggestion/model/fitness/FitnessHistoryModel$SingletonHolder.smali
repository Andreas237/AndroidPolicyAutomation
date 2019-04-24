.class Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$SingletonHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SingletonHolder"
.end annotation


# static fields
.field private static final INSTANCE:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 94
    new-instance v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;)V

    sput-object v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$SingletonHolder;->INSTANCE:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;
    .locals 1

    .line 93
    sget-object v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$SingletonHolder;->INSTANCE:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    return-object v0
.end method
