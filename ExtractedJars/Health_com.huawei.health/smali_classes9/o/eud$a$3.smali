.class Lo/eud$a$3;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eud$a;->onComplete(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/eud$a;

.field final synthetic c:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/eud$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/eud$a$3;->b:Lo/eud$a;

    iput-object p2, p0, Lo/eud$a$3;->c:Ljava/lang/String;

    iput-object p3, p0, Lo/eud$a$3;->e:Ljava/lang/String;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 7

    .line 126
    iget-object v0, p0, Lo/eud$a$3;->b:Lo/eud$a;

    iget-object v0, v0, Lo/eud$a;->a:Lo/eud;

    iget-object v1, p0, Lo/eud$a$3;->b:Lo/eud$a;

    iget-object v1, v1, Lo/eud$a;->a:Lo/eud;

    invoke-static {v1}, Lo/eud;->c(Lo/eud;)Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lo/eud$a$3;->c:Ljava/lang/String;

    iget-object v3, p0, Lo/eud$a$3;->e:Ljava/lang/String;

    const-string v4, "QQ"

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/eud;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 127
    iget-object v0, p0, Lo/eud$a$3;->b:Lo/eud$a;

    iget-object v0, v0, Lo/eud$a;->a:Lo/eud;

    invoke-static {v0}, Lo/eud;->b(Lo/eud;)Lo/euh;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 129
    iget-object v0, p0, Lo/eud$a$3;->b:Lo/eud$a;

    iget-object v0, v0, Lo/eud$a;->a:Lo/eud;

    invoke-static {v0}, Lo/eud;->b(Lo/eud;)Lo/euh;

    move-result-object v0

    iget-object v2, p0, Lo/eud$a$3;->c:Ljava/lang/String;

    iget-object v3, p0, Lo/eud$a$3;->e:Ljava/lang/String;

    move-object v4, v6

    const/4 v1, 0x0

    const/4 v5, -0x1

    invoke-interface/range {v0 .. v5}, Lo/euh;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 134
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 122
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/eud$a$3;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
