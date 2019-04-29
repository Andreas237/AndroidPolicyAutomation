.class public Lcom/yandex/metrica/impl/bl$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/yandex/metrica/impl/bl$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:Landroid/content/pm/ServiceInfo;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/pm/ServiceInfo;IIJ)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput p3, p0, Lcom/yandex/metrica/impl/bl$a;->a:I

    .line 54
    iput p2, p0, Lcom/yandex/metrica/impl/bl$a;->b:I

    .line 55
    iput-object p1, p0, Lcom/yandex/metrica/impl/bl$a;->d:Landroid/content/pm/ServiceInfo;

    .line 56
    iput-wide p4, p0, Lcom/yandex/metrica/impl/bl$a;->c:J

    .line 57
    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iput-object p1, p0, Lcom/yandex/metrica/impl/bl$a;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/bl$a;)I
    .locals 5

    .line 62
    iget v0, p0, Lcom/yandex/metrica/impl/bl$a;->b:I

    iget v1, p1, Lcom/yandex/metrica/impl/bl$a;->b:I

    if-eq v0, v1, :cond_0

    .line 63
    iget v0, p0, Lcom/yandex/metrica/impl/bl$a;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget p1, p1, Lcom/yandex/metrica/impl/bl$a;->b:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result p1

    return p1

    .line 65
    :cond_0
    iget-wide v0, p0, Lcom/yandex/metrica/impl/bl$a;->c:J

    iget-wide v2, p1, Lcom/yandex/metrica/impl/bl$a;->c:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 66
    iget-wide v0, p0, Lcom/yandex/metrica/impl/bl$a;->c:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p1, Lcom/yandex/metrica/impl/bl$a;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 44
    check-cast p1, Lcom/yandex/metrica/impl/bl$a;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/bl$a;->a(Lcom/yandex/metrica/impl/bl$a;)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MetricaServiceDescriptor{apiLevel="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/yandex/metrica/impl/bl$a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/yandex/metrica/impl/bl$a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timeInstalled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/bl$a;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
