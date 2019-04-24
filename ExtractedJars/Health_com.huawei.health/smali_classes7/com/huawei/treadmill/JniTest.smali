.class public Lcom/huawei/treadmill/JniTest;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const-string v0, "native-lib"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getCurrentStepSource()I
.end method

.method public native initAlg([I)I
.end method

.method public native processAlg([I[I)[I
.end method

.method public native stopAlg()V
.end method
