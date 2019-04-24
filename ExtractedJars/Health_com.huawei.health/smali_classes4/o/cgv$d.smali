.class Lo/cgv$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field a:D

.field b:D

.field d:D

.field e:D


# direct methods
.method public constructor <init>(DD)V
    .locals 0

    .line 496
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 497
    iput-wide p1, p0, Lo/cgv$d;->a:D

    .line 498
    iput-wide p3, p0, Lo/cgv$d;->d:D

    .line 499
    return-void
.end method
