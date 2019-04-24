.class public final Lcom/huawei/updatesdk/support/pm/g$a;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/updatesdk/support/pm/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:Z

.field private d:Lcom/huawei/updatesdk/support/pm/b;


# direct methods
.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->c:Z

    iput-object p1, p0, Lcom/huawei/updatesdk/support/pm/g$a;->a:Ljava/lang/String;

    iput p2, p0, Lcom/huawei/updatesdk/support/pm/g$a;->b:I

    iput-boolean p3, p0, Lcom/huawei/updatesdk/support/pm/g$a;->c:Z

    return-void
.end method

.method private a()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v2, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PackageService"

    const-string v1, "file delete error."

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static a(Ljava/lang/String;I)V
    .locals 2

    new-instance v1, Lcom/huawei/updatesdk/support/pm/g$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, p1, v0}, Lcom/huawei/updatesdk/support/pm/g$a;-><init>(Ljava/lang/String;IZ)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/huawei/updatesdk/support/pm/g$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public static a(Ljava/lang/String;IZ)V
    .locals 2

    new-instance v1, Lcom/huawei/updatesdk/support/pm/g$a;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/updatesdk/support/pm/g$a;-><init>(Ljava/lang/String;IZ)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/huawei/updatesdk/support/pm/g$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/io/File;)V
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "PackageService"

    const-string v1, "getbackFile mkdirs failed!"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v5}, Lcom/huawei/updatesdk/support/pm/f;->a(Ljava/io/File;Ljava/io/File;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-direct {p0}, Lcom/huawei/updatesdk/support/pm/g$a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/pm/g;->a(II)V

    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->c:Z

    goto :goto_0

    :cond_2
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/io/File;->setExecutable(ZZ)Z

    :cond_3
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/io/File;->setReadable(ZZ)Z

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v0, v3}, Lcom/huawei/updatesdk/support/pm/b;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "install|pkg:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/support/pm/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|path:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/Thread;

    new-instance v0, Lcom/huawei/updatesdk/support/pm/e;

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/support/pm/e;-><init>(Landroid/content/Context;Lcom/huawei/updatesdk/support/pm/b;)V

    invoke-direct {v9, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v9, v8}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/Thread;->start()V

    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 5

    invoke-static {p1}, Lcom/huawei/updatesdk/support/pm/g;->a(Ljava/lang/String;)Lcom/huawei/updatesdk/support/pm/b;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->b:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/huawei/updatesdk/support/pm/g;->a:Lcom/huawei/updatesdk/support/pm/d;

    sget-object v1, Lcom/huawei/updatesdk/support/pm/c$b;->a:Lcom/huawei/updatesdk/support/pm/c$b;

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/support/pm/d;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/support/c/a;->a(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_1
    iget-boolean v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->c:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    iget-object v1, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/support/pm/b;->h()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/support/pm/b;->b(I)V

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/support/pm/b;->h()I

    move-result v0

    invoke-static {}, Lcom/huawei/updatesdk/support/b/c;->b()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    if-lt v0, v1, :cond_2

    const-string v0, "PackageService"

    const-string v1, "getRetryBackupPaths large,can not change file path to retry install"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->c:Z

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-static {}, Lcom/huawei/updatesdk/support/b/c;->b()[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/support/pm/b;->h()I

    move-result v1

    aget-object v3, v0, v1

    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "PackageService"

    const-string v1, "file do not exist,can not change file path to retry install"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->c:Z

    const/4 v0, 0x0

    return v0

    :cond_3
    invoke-direct {p0, v3, v4}, Lcom/huawei/updatesdk/support/pm/g$a;->a(Ljava/lang/String;Ljava/io/File;)V

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Lcom/huawei/updatesdk/support/pm/g$a;->a()V

    :cond_5
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private b()Z
    .locals 4

    const/4 v2, 0x1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    new-instance v3, Landroid/content/ContextWrapper;

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v3, v0}, Landroid/content/ContextWrapper;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    const/4 v2, 0x0

    :cond_0
    return v2
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/updatesdk/support/pm/g$a;->a(Ljava/lang/String;)Z

    move-result v2

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/huawei/updatesdk/support/pm/c$b;->a:Lcom/huawei/updatesdk/support/pm/c$b;

    iget-object v1, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/support/pm/b;->g()Lcom/huawei/updatesdk/support/pm/c$b;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->b:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/g$a;->d:Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/support/pm/b;->h()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    invoke-direct {p0}, Lcom/huawei/updatesdk/support/pm/g$a;->a()V

    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/Boolean;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/support/pm/g$a;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/support/pm/g$a;->a(Ljava/lang/Boolean;)V

    return-void
.end method
