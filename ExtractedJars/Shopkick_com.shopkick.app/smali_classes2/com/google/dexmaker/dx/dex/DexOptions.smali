.class public Lcom/google/dexmaker/dx/dex/DexOptions;
.super Ljava/lang/Object;
.source "DexOptions.java"


# instance fields
.field public targetApiLevel:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xd

    .line 24
    iput v0, p0, Lcom/google/dexmaker/dx/dex/DexOptions;->targetApiLevel:I

    return-void
.end method


# virtual methods
.method public canUseExtendedOpcodes()Z
    .locals 2

    .line 38
    iget v0, p0, Lcom/google/dexmaker/dx/dex/DexOptions;->targetApiLevel:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getMagic()Ljava/lang/String;
    .locals 1

    .line 30
    iget v0, p0, Lcom/google/dexmaker/dx/dex/DexOptions;->targetApiLevel:I

    invoke-static {v0}, Lcom/google/dexmaker/dx/dex/DexFormat;->apiToMagic(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
