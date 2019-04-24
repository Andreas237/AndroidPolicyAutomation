.class public Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mContent:Ljava/lang/String;

.field private mTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->mTitle:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->mContent:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public acquireContent()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public acquireTitle()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->mTitle:Ljava/lang/String;

    return-object v0
.end method
