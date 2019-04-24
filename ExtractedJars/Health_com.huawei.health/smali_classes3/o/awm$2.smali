.class final Lo/awm$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awm;->e(Landroid/content/Context;Lo/awm$c;)Lo/boj$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic e:Lo/awm$c;


# direct methods
.method constructor <init>(Lo/awm$c;Landroid/content/Context;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lo/awm$2;->e:Lo/awm$c;

    iput-object p2, p0, Lo/awm$2;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/widget/EditText;)V
    .locals 0

    .line 140
    return-void
.end method

.method public d(Landroid/widget/EditText;)V
    .locals 5

    .line 125
    iget-object v0, p0, Lo/awm$2;->e:Lo/awm$c;

    if-nez v0, :cond_0

    .line 127
    return-void

    .line 129
    :cond_0
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 130
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    return-void

    .line 134
    :cond_1
    iget-object v0, p0, Lo/awm$2;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/awm$2;->e:Lo/awm$c;

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/awm;->d(Landroid/content/Context;Lo/bfh;Lo/awm$c;Ljava/lang/String;)V

    .line 135
    return-void
.end method
