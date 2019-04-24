.class public Lcom/usebutton/sdk/internal/util/Data;
.super Ljava/lang/Object;
.source "Data.java"


# instance fields
.field public final mData:[B
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>([B)V
    .locals 0
    .param p1    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    return-void
.end method
