.class Lo/aza$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:I

.field b:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lo/aza$c;->b:Landroid/app/Activity;

    .line 46
    const/4 v0, 0x1

    iput v0, p0, Lo/aza$c;->a:I

    .line 47
    return-void
.end method

.method constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lo/aza$c;->b:Landroid/app/Activity;

    .line 40
    iput p2, p0, Lo/aza$c;->a:I

    .line 41
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 52
    if-ne p0, p1, :cond_0

    .line 54
    const/4 v0, 0x1

    return v0

    .line 57
    :cond_0
    instance-of v0, p1, Lo/aza$c;

    if-nez v0, :cond_1

    .line 59
    const/4 v0, 0x0

    return v0

    .line 62
    :cond_1
    iget-object v0, p0, Lo/aza$c;->b:Landroid/app/Activity;

    move-object v1, p1

    check-cast v1, Lo/aza$c;

    iget-object v1, v1, Lo/aza$c;->b:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 68
    iget-object v0, p0, Lo/aza$c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
