.class abstract Lo/ezf$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezf$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# instance fields
.field protected a:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:F


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 1

    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    const/4 v0, 0x0

    iput v0, p0, Lo/ezf$b;->e:F

    .line 240
    const v0, -0x777778

    iput v0, p0, Lo/ezf$b;->c:I

    .line 241
    const/4 v0, 0x0

    iput v0, p0, Lo/ezf$b;->d:I

    .line 244
    iput-object p1, p0, Lo/ezf$b;->a:Landroid/content/Context;

    .line 245
    iput p2, p0, Lo/ezf$b;->d:I

    .line 246
    iput p3, p0, Lo/ezf$b;->c:I

    .line 247
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 267
    iget v0, p0, Lo/ezf$b;->d:I

    return v0
.end method

.method public d()F
    .locals 1

    .line 257
    iget v0, p0, Lo/ezf$b;->e:F

    return v0
.end method

.method public e()I
    .locals 1

    .line 262
    iget v0, p0, Lo/ezf$b;->c:I

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 251
    iput p1, p0, Lo/ezf$b;->e:F

    .line 252
    return-void
.end method
