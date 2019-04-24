.class public Lo/din;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/Integer;

.field private c:Ljava/lang/String;

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/din;->d:Landroid/graphics/drawable/Drawable;

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/din;->c:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/din;->e:Ljava/lang/String;

    .line 18
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/din;->b:Ljava/lang/Integer;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/din;->d:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/din;->e:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 53
    iget-object v0, p0, Lo/din;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public c(I)V
    .locals 1

    .line 49
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/din;->b:Ljava/lang/Integer;

    .line 50
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lo/din;->e:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/din;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lo/din;->d:Landroid/graphics/drawable/Drawable;

    .line 26
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lo/din;->c:Ljava/lang/String;

    .line 34
    return-void
.end method
