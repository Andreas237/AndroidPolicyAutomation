.class abstract Lo/asj$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/asj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "e"
.end annotation


# instance fields
.field final synthetic e:Lo/asj;


# direct methods
.method private constructor <init>(Lo/asj;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lo/asj$e;->e:Lo/asj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/asj;Lo/asj$2;)V
    .locals 0

    .line 167
    invoke-direct {p0, p1}, Lo/asj$e;-><init>(Lo/asj;)V

    return-void
.end method


# virtual methods
.method abstract b()V
.end method

.method public run()V
    .locals 4

    .line 173
    iget-object v0, p0, Lo/asj$e;->e:Lo/asj;

    invoke-static {v0}, Lo/asj;->c(Lo/asj;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/asm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    return-void

    .line 178
    :cond_0
    iget-object v0, p0, Lo/asj$e;->e:Lo/asj;

    invoke-static {v0}, Lo/asj;->c(Lo/asj;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.WRITE_CONTACTS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/biq;->d(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 180
    invoke-virtual {p0}, Lo/asj$e;->b()V

    goto :goto_0

    .line 184
    :cond_1
    const-string v0, "ContactsSync"

    const-string v1, "Have not been granted write contact permission."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    :goto_0
    return-void
.end method
