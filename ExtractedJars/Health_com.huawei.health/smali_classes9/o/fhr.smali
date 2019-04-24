.class public Lo/fhr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/text/SpannableString;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/text/SpannableString;Ljava/lang/String;Z)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lo/fhr;->b:Landroid/text/SpannableString;

    .line 16
    iput-object p2, p0, Lo/fhr;->a:Ljava/lang/String;

    .line 17
    iput-boolean p3, p0, Lo/fhr;->c:Z

    .line 18
    return-void
.end method


# virtual methods
.method public b()Landroid/text/SpannableString;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/fhr;->b:Landroid/text/SpannableString;

    return-object v0
.end method

.method public b(Z)V
    .locals 0

    .line 41
    iput-boolean p1, p0, Lo/fhr;->c:Z

    .line 42
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/fhr;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lo/fhr;->c:Z

    return v0
.end method
