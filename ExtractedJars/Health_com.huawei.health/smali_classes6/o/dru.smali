.class public Lo/dru;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const-class v0, Lo/dru;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dru;->d:Ljava/lang/String;

    .line 32
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Lo/dru;->a:I

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dru;->c:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 196
    const-string v0, "authen_Token"

    invoke-static {p0, p1, v0}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static a(Lo/dqz;Ljava/lang/String;)Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 187
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0}, Lo/dqz;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 218
    sget-object v0, Lo/dru;->c:Ljava/util/HashMap;

    return-object v0
.end method

.method private static b(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)Z
    .locals 3

    .line 162
    sget v0, Lo/dru;->a:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    .line 163
    const/16 v0, 0x3f6

    invoke-static {p2, v0}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 164
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "SDK is lower than N"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    const/4 v0, 0x0

    return v0

    .line 167
    :cond_0
    invoke-static {p0}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 168
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 169
    const/16 v0, 0x3f5

    invoke-static {p2, v0}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 170
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "getImsi result is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    const/4 v0, 0x0

    return v0

    .line 173
    :cond_1
    invoke-virtual {p1}, Lo/dqz;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-static {p1, v2}, Lo/dru;->a(Lo/dqz;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 174
    const/16 v0, 0x3f5

    invoke-static {p2, v0}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 175
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "Imsi is invalid"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    const/4 v0, 0x0

    return v0

    .line 178
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method static d(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)Z
    .locals 5

    .line 41
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "Start Auth Method"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 43
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "Start Auth Method failed, message is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    const/4 v0, 0x0

    return v0

    .line 46
    :cond_0
    invoke-static {p0, p1, p2}, Lo/dru;->e(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 47
    const/4 v0, 0x0

    return v0

    .line 49
    :cond_1
    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-static {v0, p0}, Lo/dqx;->c(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v2

    .line 50
    if-nez v2, :cond_2

    .line 51
    const/16 v0, 0x3f2

    invoke-static {p2, v0}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 52
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "Start Authen Method failed, do not has READ_PHONE_STATE permission"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    const/4 v0, 0x0

    return v0

    .line 55
    :cond_2
    invoke-virtual {p1}, Lo/dqz;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 56
    new-instance v3, Lo/drt;

    invoke-direct {v3, p0, p2}, Lo/drt;-><init>(Landroid/content/Context;Landroid/os/Message;)V

    .line 57
    new-instance v4, Lo/dqu;

    invoke-direct {v4, p0}, Lo/dqu;-><init>(Landroid/content/Context;)V

    .line 58
    invoke-virtual {v4}, Lo/dqu;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/drt;->d(Ljava/lang/String;)V

    .line 59
    const/4 v0, 0x1

    return v0

    .line 60
    :cond_3
    invoke-virtual {p1}, Lo/dqz;->e()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_6

    .line 61
    invoke-static {p0}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 62
    invoke-static {p0, v3}, Lo/dru;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 63
    const-string v0, "Tag"

    invoke-static {p0, v3, v0}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 64
    const/16 v0, 0x3e8

    iput v0, p2, Landroid/os/Message;->arg1:I

    .line 65
    invoke-static {p2}, Lo/dsh;->e(Landroid/os/Message;)V

    .line 66
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "Auth token is exist."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    const/4 v0, 0x1

    return v0

    .line 69
    :cond_4
    invoke-static {p0, p1, p2}, Lo/dru;->b(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 70
    const/4 v0, 0x0

    return v0

    .line 72
    :cond_5
    new-instance v4, Lo/dsb;

    invoke-direct {v4, p0, p1, p2}, Lo/dsb;-><init>(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)V

    .line 73
    invoke-virtual {v4}, Lo/dry;->a()V

    .line 74
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_6
    const/16 v0, 0x3f3

    invoke-static {p2, v0}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 77
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "Auth type is invalidate"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    const/4 v0, 0x0

    return v0
.end method

.method static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 204
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "setCmccSsoParam"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    sget-object v0, Lo/dru;->c:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 206
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dru;->c:Ljava/util/HashMap;

    .line 208
    :cond_0
    sget-object v0, Lo/dru;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 209
    sget-object v0, Lo/dru;->c:Ljava/util/HashMap;

    const-string v1, "appid"

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    sget-object v0, Lo/dru;->c:Ljava/util/HashMap;

    const-string v1, "appkey"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    return-void
.end method

.method private static e(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)Z
    .locals 2

    .line 83
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 84
    const/16 v0, 0x3f5

    invoke-static {p2, v0}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 85
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "Check is valid input param and network failed, context is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    const/4 v0, 0x0

    return v0

    .line 88
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 89
    const/16 v0, 0x3f5

    invoke-static {p2, v0}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 90
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "Auth param is invalidate"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    const/4 v0, 0x0

    return v0

    .line 93
    :cond_1
    invoke-static {p0}, Lo/dsh;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 94
    const/16 v0, 0x3f0

    invoke-static {p2, v0}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 95
    sget-object v0, Lo/dru;->d:Ljava/lang/String;

    const-string v1, "Network no Connected"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    const/4 v0, 0x0

    return v0

    .line 98
    :cond_2
    const/4 v0, 0x1

    return v0
.end method
