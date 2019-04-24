.class public Lo/cnr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cnr$e;,
        Lo/cnr$d;
    }
.end annotation


# static fields
.field private static a:Lo/cnr$e;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 92
    const-string v0, "UNSETTED"

    sput-object v0, Lo/cnr;->d:Ljava/lang/String;

    .line 93
    const-string v0, "UNSETTED_ID"

    sput-object v0, Lo/cnr;->c:Ljava/lang/String;

    .line 94
    new-instance v0, Lo/cnr$e;

    invoke-direct {v0}, Lo/cnr$e;-><init>()V

    sput-object v0, Lo/cnr;->a:Lo/cnr$e;

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/cnr;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/cnr;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 139
    sget v0, Lo/cnr$d;->b:I

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v1, v2, v0, p0, p1}, Lo/cnr;->c(ZZILjava/lang/String;[Ljava/lang/Object;)V

    .line 140
    return-void
.end method

.method public static varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 197
    sget v0, Lo/cnr$d;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v1, v2, v0, p0, p1}, Lo/cnr;->c(ZZILjava/lang/String;[Ljava/lang/Object;)V

    .line 198
    return-void
.end method

.method public static varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 150
    sget v0, Lo/cnr$d;->d:I

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v1, v2, v0, p0, p1}, Lo/cnr;->c(ZZILjava/lang/String;[Ljava/lang/Object;)V

    .line 151
    return-void
.end method

.method private static varargs c(ZZILjava/lang/String;[Ljava/lang/Object;)V
    .locals 6

    .line 154
    if-nez p0, :cond_0

    .line 155
    return-void

    .line 157
    :cond_0
    if-eqz p1, :cond_1

    .line 158
    sget-object v0, Lo/cnr;->a:Lo/cnr$e;

    invoke-virtual {v0, p2, p3}, Lo/cnr$e;->d(ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 160
    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lo/cnr;->b:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p4, v0}, Lo/cnr;->e([Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 161
    if-eqz v3, :cond_3

    .line 163
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    .line 164
    :goto_0
    if-eqz v5, :cond_3

    .line 165
    const/16 v0, 0x3e8

    if-le v5, v0, :cond_2

    .line 166
    const/4 v0, 0x0

    const/16 v1, 0x3e8

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 167
    const/16 v0, 0x3e8

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 169
    :cond_2
    move-object v4, v3

    .line 170
    const-string v3, ""

    .line 172
    :goto_1
    invoke-static {p2, p3, v4}, Lo/cnr;->d(ILjava/lang/String;Ljava/lang/String;)V

    .line 173
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    goto :goto_0

    .line 176
    :cond_3
    return-void
.end method

.method private static d(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 224
    sget v0, Lo/cnr$d;->d:I

    if-ne p0, v0, :cond_0

    .line 225
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 226
    :cond_0
    sget v0, Lo/cnr$d;->e:I

    if-ne p0, v0, :cond_1

    .line 227
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 228
    :cond_1
    sget v0, Lo/cnr$d;->b:I

    if-ne p0, v0, :cond_2

    .line 229
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 230
    :cond_2
    sget v0, Lo/cnr$d;->c:I

    if-ne p0, v0, :cond_3

    .line 231
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 232
    :cond_3
    sget v0, Lo/cnr$d;->a:I

    if-ne p0, v0, :cond_4

    .line 233
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    :cond_4
    :goto_0
    return-void
.end method

.method public static varargs d(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 186
    sget v0, Lo/cnr$d;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v1, v2, v0, p0, p1}, Lo/cnr;->c(ZZILjava/lang/String;[Ljava/lang/Object;)V

    .line 187
    return-void
.end method

.method private static varargs e([Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 238
    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    .line 239
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 241
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    if-eqz p1, :cond_2

    const/4 v0, 0x0

    aget-object v0, p1, v0

    if-eqz v0, :cond_2

    .line 243
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 244
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 247
    :cond_2
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 248
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 247
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 250
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
