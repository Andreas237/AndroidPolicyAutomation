.class public Lcom/huawei/hwid/core/d/b/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/d/b/a/a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/text/SimpleDateFormat;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:I

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/huawei/hwid/core/d/b/a/a$a;)V
    .locals 3

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss.SSS"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->a:Ljava/text/SimpleDateFormat;

    .line 48
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->a(Lcom/huawei/hwid/core/d/b/a/a$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->b:J

    .line 50
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->b(Lcom/huawei/hwid/core/d/b/a/a$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->c:J

    .line 52
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->c(Lcom/huawei/hwid/core/d/b/a/a$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->d:J

    .line 54
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->d(Lcom/huawei/hwid/core/d/b/a/a$a;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->e:I

    .line 56
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->e(Lcom/huawei/hwid/core/d/b/a/a$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->f:Ljava/lang/String;

    .line 58
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->f(Lcom/huawei/hwid/core/d/b/a/a$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->g:Ljava/lang/String;

    .line 60
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->g(Lcom/huawei/hwid/core/d/b/a/a$a;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->h:I

    .line 62
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->h(Lcom/huawei/hwid/core/d/b/a/a$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->i:Ljava/lang/String;

    .line 64
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->i(Lcom/huawei/hwid/core/d/b/a/a$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->j:Ljava/lang/String;

    .line 65
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwid/core/d/b/a/a$a;Lcom/huawei/hwid/core/d/b/a/a$1;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/d/b/a/a;-><init>(Lcom/huawei/hwid/core/d/b/a/a$a;)V

    return-void
.end method

.method private static a(I)C
    .locals 1

    .line 160
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 162
    :pswitch_0
    const/16 v0, 0x56

    return v0

    .line 164
    :pswitch_1
    const/16 v0, 0x44

    return v0

    .line 166
    :pswitch_2
    const/16 v0, 0x49

    return v0

    .line 168
    :pswitch_3
    const/16 v0, 0x57

    return v0

    .line 170
    :pswitch_4
    const/16 v0, 0x45

    return v0

    .line 172
    :pswitch_5
    const/16 v0, 0x41

    return v0

    .line 174
    :goto_0
    const/16 v0, 0x56

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static a(ILjava/lang/String;)Lcom/huawei/hwid/core/d/b/a/a$a;
    .locals 2

    .line 179
    new-instance v0, Lcom/huawei/hwid/core/d/b/a/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/huawei/hwid/core/d/b/a/a$a;-><init>(ILjava/lang/String;Lcom/huawei/hwid/core/d/b/a/a$1;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/StringBuilder;)V
    .locals 3

    .line 91
    const-string v0, "["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->a:Ljava/text/SimpleDateFormat;

    iget-wide v1, p0, Lcom/huawei/hwid/core/d/b/a/a;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    iget v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->e:I

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/a/a;->a(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/d/b/a/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    iget-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->c:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwid/core/d/b/a/a;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 97
    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwid/core/d/b/a/a;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    const-string v0, "]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    return-void
.end method

.method public b(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    return-void
.end method

.method public c(Ljava/lang/StringBuilder;)V
    .locals 2

    .line 132
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 133
    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/d/b/a/a;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    invoke-virtual {p0, v1}, Lcom/huawei/hwid/core/d/b/a/a;->a(Ljava/lang/StringBuilder;)V

    .line 145
    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    invoke-virtual {p0, v1}, Lcom/huawei/hwid/core/d/b/a/a;->b(Ljava/lang/StringBuilder;)V

    .line 147
    invoke-virtual {p0, v1}, Lcom/huawei/hwid/core/d/b/a/a;->c(Ljava/lang/StringBuilder;)V

    .line 148
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
