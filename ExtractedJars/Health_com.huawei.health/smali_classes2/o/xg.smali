.class public Lo/xg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/xi;


# static fields
.field public static final c:Ljava/lang/String;

.field private static e:Lo/xi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Lo/xg;

    .line 27
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/xg;->c:Ljava/lang/String;

    .line 26
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    return-void
.end method

.method public static d()Lo/xi;
    .locals 1

    .line 30
    sget-object v0, Lo/xg;->e:Lo/xi;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lo/xg;

    invoke-direct {v0}, Lo/xg;-><init>()V

    sput-object v0, Lo/xg;->e:Lo/xi;

    .line 33
    :cond_0
    sget-object v0, Lo/xg;->e:Lo/xi;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;I)V
    .locals 5

    .line 82
    sget-object v0, Lo/xg;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter saveHobbiesToDB "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v4

    .line 86
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-static {v4}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p2}, Lo/wr;->a(JI)I

    .line 88
    return-void
.end method

.method public b(Landroid/content/Context;I)V
    .locals 4

    .line 102
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v3

    .line 104
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-static {v3}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p2}, Lo/wr;->e(JI)I

    .line 105
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 72
    sget-object v0, Lo/xg;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter saveStatusToDB  status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v4

    .line 76
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-static {v4}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {p2}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/wr;->d(JLjava/lang/String;)I

    .line 78
    return-void
.end method

.method public d(Landroid/content/Context;JI)V
    .locals 1

    .line 118
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lo/wr;->e(JI)I

    .line 119
    return-void
.end method
