.class public Lo/edd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private d:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Landroid/view/View$OnClickListener;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/edd;->d:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lo/edd;->a:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public c(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lo/edd;->d:Landroid/view/View$OnClickListener;

    .line 29
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/edd;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lo/edd;->b:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/edd;->b:Ljava/lang/String;

    return-object v0
.end method
