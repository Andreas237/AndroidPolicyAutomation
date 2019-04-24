.class public Lo/avk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/avk$b;,
        Lo/avk$d;
    }
.end annotation


# static fields
.field private static a:Lo/avk;


# instance fields
.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Lo/avk$b;Lo/avk$d;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 91
    new-instance v0, Lo/avk;

    invoke-direct {v0}, Lo/avk;-><init>()V

    sput-object v0, Lo/avk;->a:Lo/avk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/avk;->b:Ljava/util/HashMap;

    .line 95
    return-void
.end method

.method private c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z
    .locals 3

    .line 81
    iget-object v0, p0, Lo/avk;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/avk$d;

    .line 82
    const/4 v2, 0x0

    .line 83
    if-eqz v1, :cond_0

    .line 85
    invoke-interface {v1, p2, p3}, Lo/avk$d;->e(Lo/auu$b;Landroid/os/Bundle;)V

    .line 86
    const/4 v2, 0x1

    .line 88
    :cond_0
    return v2
.end method

.method private e(JI)Landroid/os/Bundle;
    .locals 2

    .line 195
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 196
    const-string v0, "keyBundleGroupId"

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 197
    const-string v0, "keyBundleNotifyType"

    invoke-virtual {v1, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 198
    return-object v1
.end method

.method public static e()Lo/avk;
    .locals 1

    .line 99
    sget-object v0, Lo/avk;->a:Lo/avk;

    return-object v0
.end method


# virtual methods
.method public a(JI)V
    .locals 3

    .line 165
    sget-object v0, Lo/avk$b;->e:Lo/avk$b;

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/avk;->c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z

    .line 167
    sget-object v0, Lo/avk$b;->d:Lo/avk$b;

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    invoke-direct {p0, p1, p2, p3}, Lo/avk;->e(JI)Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lo/avk;->c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z

    .line 168
    return-void
.end method

.method public b(Landroid/os/Bundle;)J
    .locals 5

    .line 225
    const-wide/16 v3, 0x0

    .line 226
    if-eqz p1, :cond_0

    .line 228
    const-string v0, "keyBundleUserId"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    .line 230
    :cond_0
    return-wide v3
.end method

.method public b()V
    .locals 3

    .line 139
    sget-object v0, Lo/avk$b;->e:Lo/avk$b;

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/avk;->c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    sget-object v0, Lo/avk$b;->b:Lo/avk$b;

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/avk;->c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z

    .line 143
    :cond_0
    sget-object v0, Lo/avk$b;->c:Lo/avk$b;

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/avk;->c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z

    .line 144
    return-void
.end method

.method public b(JI)V
    .locals 3

    .line 183
    sget-object v0, Lo/avk$b;->d:Lo/avk$b;

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    invoke-direct {p0, p1, p2, p3}, Lo/avk;->e(JI)Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lo/avk;->c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z

    .line 184
    return-void
.end method

.method public c(Lo/avk$b;)V
    .locals 2

    .line 64
    iget-object v0, p0, Lo/avk;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/avk$d;

    .line 65
    if-eqz v1, :cond_0

    .line 67
    iget-object v0, p0, Lo/avk;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :cond_0
    return-void
.end method

.method public c(Lo/avk$b;Lo/avk$d;)V
    .locals 2

    .line 50
    iget-object v0, p0, Lo/avk;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/avk$d;

    .line 51
    if-nez v1, :cond_0

    .line 53
    iget-object v0, p0, Lo/avk;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    :cond_0
    return-void
.end method

.method public d(Landroid/os/Bundle;)J
    .locals 5

    .line 209
    const-wide/16 v3, 0x0

    .line 210
    if-eqz p1, :cond_0

    .line 212
    const-string v0, "keyBundleGroupId"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    .line 214
    :cond_0
    return-wide v3
.end method

.method public d()V
    .locals 3

    .line 128
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 130
    const-string v0, "keyBundleNotifyType"

    const/16 v1, 0x11

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 131
    sget-object v0, Lo/avk$b;->d:Lo/avk$b;

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    invoke-direct {p0, v0, v1, v2}, Lo/avk;->c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z

    .line 132
    return-void
.end method

.method public d(JI)V
    .locals 3

    .line 153
    sget-object v0, Lo/avk$b;->e:Lo/avk$b;

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/avk;->c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z

    .line 155
    sget-object v0, Lo/avk$b;->d:Lo/avk$b;

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    invoke-direct {p0, p1, p2, p3}, Lo/avk;->e(JI)Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lo/avk;->c(Lo/avk$b;Lo/auu$b;Landroid/os/Bundle;)Z

    .line 156
    return-void
.end method

.method public e(Landroid/os/Bundle;)I
    .locals 3

    .line 241
    const/4 v2, 0x0

    .line 242
    if-eqz p1, :cond_0

    .line 244
    const-string v0, "keyBundleNotifyType"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 246
    :cond_0
    return v2
.end method
