.class public Lo/cio;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/widget/RelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cio;->d:Landroid/widget/TextView;

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cio;->b:Landroid/widget/TextView;

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cio;->a:Landroid/widget/TextView;

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cio;->e:Landroid/widget/RelativeLayout;

    .line 55
    iput-object p2, p0, Lo/cio;->b:Landroid/widget/TextView;

    .line 56
    iput-object p3, p0, Lo/cio;->a:Landroid/widget/TextView;

    .line 57
    iput-object p1, p0, Lo/cio;->e:Landroid/widget/RelativeLayout;

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/widget/RelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cio;->d:Landroid/widget/TextView;

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cio;->b:Landroid/widget/TextView;

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cio;->a:Landroid/widget/TextView;

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cio;->e:Landroid/widget/RelativeLayout;

    .line 48
    iput-object p2, p0, Lo/cio;->d:Landroid/widget/TextView;

    .line 49
    iput-object p3, p0, Lo/cio;->b:Landroid/widget/TextView;

    .line 50
    iput-object p4, p0, Lo/cio;->a:Landroid/widget/TextView;

    .line 51
    iput-object p1, p0, Lo/cio;->e:Landroid/widget/RelativeLayout;

    .line 52
    return-void
.end method


# virtual methods
.method public a()Landroid/widget/TextView;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/cio;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method public a(Lo/cin;)V
    .locals 2

    .line 61
    iget-object v0, p0, Lo/cio;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/cin;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    iget-object v0, p0, Lo/cio;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/cin;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    iget-object v0, p0, Lo/cio;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/cin;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    return-void
.end method

.method public b()Landroid/widget/TextView;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/cio;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method public d()Landroid/widget/TextView;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/cio;->a:Landroid/widget/TextView;

    return-object v0
.end method
