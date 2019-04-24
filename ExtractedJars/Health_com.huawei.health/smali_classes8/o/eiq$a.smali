.class Lo/eiq$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eiq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field b:F

.field d:F


# direct methods
.method constructor <init>(FF)V
    .locals 0

    .line 266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 267
    iput p1, p0, Lo/eiq$a;->b:F

    .line 268
    iput p2, p0, Lo/eiq$a;->d:F

    .line 269
    return-void
.end method
