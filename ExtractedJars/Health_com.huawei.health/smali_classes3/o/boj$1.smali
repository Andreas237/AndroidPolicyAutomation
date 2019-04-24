.class final Lo/boj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/boj;->b(Landroid/content/DialogInterface;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/DialogInterface;

.field final synthetic d:Z


# direct methods
.method constructor <init>(Landroid/content/DialogInterface;Z)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/boj$1;->a:Landroid/content/DialogInterface;

    iput-boolean p2, p0, Lo/boj$1;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 3

    .line 107
    :try_start_0
    iget-object v0, p0, Lo/boj$1;->a:Landroid/content/DialogInterface;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "mShowing"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 108
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 109
    iget-object v0, p0, Lo/boj$1;->a:Landroid/content/DialogInterface;

    iget-boolean v1, p0, Lo/boj$1;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    .line 122
    goto :goto_0

    .line 111
    :catch_0
    move-exception v2

    .line 113
    invoke-static {}, Lo/boj;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "setDialogClosable exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    goto :goto_0

    .line 115
    :catch_1
    move-exception v2

    .line 117
    invoke-static {}, Lo/boj;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "setDialogClosable exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    goto :goto_0

    .line 119
    :catch_2
    move-exception v2

    .line 121
    invoke-static {}, Lo/boj;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "setDialogClosable exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
