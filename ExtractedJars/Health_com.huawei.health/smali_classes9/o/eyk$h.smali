.class Lo/eyk$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eyk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field a:Lo/eie;

.field b:I

.field c:Lo/eic;

.field d:I


# direct methods
.method public constructor <init>(Lo/eic;IILo/eie;)V
    .locals 0

    .line 462
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 463
    iput-object p1, p0, Lo/eyk$h;->c:Lo/eic;

    .line 464
    iput p2, p0, Lo/eyk$h;->d:I

    .line 465
    iput p3, p0, Lo/eyk$h;->b:I

    .line 466
    iput-object p4, p0, Lo/eyk$h;->a:Lo/eie;

    .line 467
    return-void
.end method
