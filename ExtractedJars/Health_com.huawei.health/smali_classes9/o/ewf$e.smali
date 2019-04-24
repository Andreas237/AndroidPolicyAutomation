.class public Lo/ewf$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public a:J

.field public c:I

.field public d:J

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 713
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 0

    .line 725
    iput p1, p0, Lo/ewf$e;->e:I

    .line 726
    iput p2, p0, Lo/ewf$e;->c:I

    .line 727
    return-void
.end method

.method public b(JJ)V
    .locals 0

    .line 720
    iput-wide p1, p0, Lo/ewf$e;->a:J

    .line 721
    iput-wide p3, p0, Lo/ewf$e;->d:J

    .line 722
    return-void
.end method
