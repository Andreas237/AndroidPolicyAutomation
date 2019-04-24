.class public abstract Lo/pr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Lo/ps;


# direct methods
.method protected constructor <init>(Lo/ps;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lo/pr;->b:Lo/ps;

    .line 36
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 1

    .line 50
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 53
    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    :cond_1
    return-void
.end method

.method public static e([Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 5

    .line 60
    if-eqz p0, :cond_0

    .line 61
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 62
    invoke-static {v4, p1}, Lo/pr;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 61
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 65
    :cond_0
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public final b()Lo/ps;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/pr;->b:Lo/ps;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 46
    invoke-virtual {p0}, Lo/pr;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
