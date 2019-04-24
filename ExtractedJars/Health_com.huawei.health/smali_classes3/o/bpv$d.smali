.class public final Lo/bpv$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bpv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/bpv$d;->a:Ljava/util/List;

    return-void
.end method

.method static synthetic b(Lo/bpv$d;)Ljava/util/List;
    .locals 1

    .line 150
    iget-object v0, p0, Lo/bpv$d;->a:Ljava/util/List;

    return-object v0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 178
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    const/4 v0, 0x0

    return v0

    .line 183
    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_3

    .line 185
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 186
    const/16 v0, 0x1f

    if-le v3, v0, :cond_1

    const/16 v0, 0x7f

    if-lt v3, v0, :cond_2

    .line 188
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 183
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 192
    :cond_3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 194
    const/4 v0, 0x0

    return v0

    .line 197
    :cond_4
    const/4 v1, 0x0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_7

    .line 199
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 200
    const/16 v0, 0x1f

    if-le v3, v0, :cond_5

    const/16 v0, 0x7f

    if-lt v3, v0, :cond_6

    .line 202
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 197
    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 206
    :cond_7
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lo/bpv$d;
    .locals 1

    .line 163
    invoke-direct {p0, p1, p2}, Lo/bpv$d;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    invoke-virtual {p0, p1, p2}, Lo/bpv$d;->b(Ljava/lang/String;Ljava/lang/String;)Lo/bpv$d;

    move-result-object v0

    return-object v0

    .line 168
    :cond_0
    return-object p0
.end method

.method b(Ljava/lang/String;Ljava/lang/String;)Lo/bpv$d;
    .locals 2

    .line 156
    iget-object v0, p0, Lo/bpv$d;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    iget-object v0, p0, Lo/bpv$d;->a:Ljava/util/List;

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lo/bpv$d;
    .locals 2

    .line 211
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/bpv$d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 213
    iget-object v0, p0, Lo/bpv$d;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    iget-object v0, p0, Lo/bpv$d;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 216
    iget-object v0, p0, Lo/bpv$d;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 217
    add-int/lit8 v1, v1, -0x2

    .line 211
    :cond_0
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 220
    :cond_1
    return-object p0
.end method

.method public e()Lo/bpv;
    .locals 2

    .line 237
    new-instance v0, Lo/bpv;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/bpv;-><init>(Lo/bpv$d;Lo/bpv$3;)V

    return-object v0
.end method
