.class Lo/fhg$a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhg$a;->c([Ljava/lang/String;Ljava/lang/Integer;)Lo/fhg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fhg$a;

.field final synthetic d:[Ljava/lang/String;

.field final synthetic e:Lo/fhg;


# direct methods
.method constructor <init>(Lo/fhg$a;Lo/fhg;[Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/fhg$a$3;->b:Lo/fhg$a;

    iput-object p2, p0, Lo/fhg$a$3;->e:Lo/fhg;

    iput-object p3, p0, Lo/fhg$a$3;->d:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 88
    iget-object v0, p0, Lo/fhg$a$3;->e:Lo/fhg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 89
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 90
    iget-object v0, p0, Lo/fhg$a$3;->b:Lo/fhg$a;

    invoke-static {v0}, Lo/fhg$a;->e(Lo/fhg$a;)I

    move-result v0

    iput v0, v2, Landroid/os/Message;->what:I

    .line 91
    iget-object v0, p0, Lo/fhg$a$3;->d:[Ljava/lang/String;

    iget-object v1, p0, Lo/fhg$a$3;->b:Lo/fhg$a;

    invoke-static {v1}, Lo/fhg$a;->a(Lo/fhg$a;)Lo/elk;

    move-result-object v1

    invoke-virtual {v1}, Lo/elk;->getValue()I

    move-result v1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Landroid/os/Message;->arg1:I

    .line 92
    iget-object v0, p0, Lo/fhg$a$3;->b:Lo/fhg$a;

    invoke-static {v0}, Lo/fhg$a;->d(Lo/fhg$a;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 93
    iget-object v0, p0, Lo/fhg$a$3;->e:Lo/fhg;

    invoke-virtual {v0}, Lo/fhg;->dismiss()V

    .line 95
    :cond_0
    return-void
.end method
