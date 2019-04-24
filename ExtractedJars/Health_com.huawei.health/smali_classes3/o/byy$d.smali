.class Lo/byy$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/byy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private d:J

.field private e:I


# direct methods
.method constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/byy$d;)I
    .locals 1

    .line 46
    iget v0, p0, Lo/byy$d;->e:I

    return v0
.end method

.method static synthetic c(Lo/byy$d;I)I
    .locals 0

    .line 46
    iput p1, p0, Lo/byy$d;->e:I

    return p1
.end method

.method static synthetic d(Lo/byy$d;)J
    .locals 2

    .line 46
    iget-wide v0, p0, Lo/byy$d;->d:J

    return-wide v0
.end method

.method static synthetic e(Lo/byy$d;J)J
    .locals 0

    .line 46
    iput-wide p1, p0, Lo/byy$d;->d:J

    return-wide p1
.end method

.method static synthetic e(Lo/byy$d;)Landroid/view/View;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/byy$d;->a:Landroid/view/View;

    return-object v0
.end method

.method static synthetic e(Lo/byy$d;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 46
    iput-object p1, p0, Lo/byy$d;->a:Landroid/view/View;

    return-object p1
.end method
