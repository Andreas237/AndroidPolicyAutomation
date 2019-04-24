.class public final Lo/fbu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public b:F

.field public d:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lo/fbu;->d:F

    .line 17
    iput p2, p0, Lo/fbu;->b:F

    .line 18
    return-void
.end method


# virtual methods
.method public b()F
    .locals 1

    .line 25
    iget v0, p0, Lo/fbu;->b:F

    return v0
.end method

.method public e()F
    .locals 1

    .line 21
    iget v0, p0, Lo/fbu;->d:F

    return v0
.end method
