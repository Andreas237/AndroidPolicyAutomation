.class public final Lcom/microblink/DateTime;
.super Ljava/lang/Object;


# instance fields
.field private date:Lcom/microblink/StringType;

.field private dateTime:Ljava/util/Date;

.field private time:Lcom/microblink/StringType;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final date(Lcom/microblink/StringType;)Lcom/microblink/DateTime;
    .locals 0

    iput-object p1, p0, Lcom/microblink/DateTime;->date:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final date()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/DateTime;->date:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final dateTime(Ljava/util/Date;)Lcom/microblink/DateTime;
    .locals 0

    iput-object p1, p0, Lcom/microblink/DateTime;->dateTime:Ljava/util/Date;

    return-object p0
.end method

.method public final dateTime()Ljava/util/Date;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/DateTime;->dateTime:Ljava/util/Date;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/microblink/DateTime;

    iget-object v2, p0, Lcom/microblink/DateTime;->dateTime:Ljava/util/Date;

    if-eqz v2, :cond_2

    iget-object p1, p1, Lcom/microblink/DateTime;->dateTime:Ljava/util/Date;

    invoke-virtual {v2, p1}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    iget-object p1, p1, Lcom/microblink/DateTime;->dateTime:Ljava/util/Date;

    if-nez p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/DateTime;->dateTime:Ljava/util/Date;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final time(Lcom/microblink/StringType;)Lcom/microblink/DateTime;
    .locals 0

    iput-object p1, p0, Lcom/microblink/DateTime;->time:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final time()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/DateTime;->time:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DateTime{dateTime="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/DateTime;->dateTime:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", date=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/DateTime;->date:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", time=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/DateTime;->time:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
