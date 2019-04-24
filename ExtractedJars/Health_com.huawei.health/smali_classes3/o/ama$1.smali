.class Lo/ama$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ama;->e(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lo/ama;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/ama;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lo/ama$1;->b:Lo/ama;

    iput-object p2, p0, Lo/ama$1;->a:Landroid/content/Context;

    iput-object p3, p0, Lo/ama$1;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 39
    iget-object v0, p0, Lo/ama$1;->b:Lo/ama;

    iget-object v1, p0, Lo/ama$1;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/ama$1;->e:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v0, v1, v2}, Lo/ama;->b(Lo/ama;Landroid/content/Context;Z)V

    .line 40
    return-void
.end method
