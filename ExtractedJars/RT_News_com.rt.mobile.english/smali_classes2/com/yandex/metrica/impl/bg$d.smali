.class public Lcom/yandex/metrica/impl/bg$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/h;

.field private b:Lcom/yandex/metrica/impl/bc;

.field private c:Z

.field private d:Lcom/yandex/metrica/impl/bg$c;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V
    .locals 1

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 167
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/bg$d;->c:Z

    .line 171
    iput-object p1, p0, Lcom/yandex/metrica/impl/bg$d;->a:Lcom/yandex/metrica/impl/h;

    .line 172
    iput-object p2, p0, Lcom/yandex/metrica/impl/bg$d;->b:Lcom/yandex/metrica/impl/bc;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/bg$d;)Lcom/yandex/metrica/impl/bc;
    .locals 0

    .line 164
    iget-object p0, p0, Lcom/yandex/metrica/impl/bg$d;->b:Lcom/yandex/metrica/impl/bc;

    return-object p0
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/bg$d;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 164
    iget-object p0, p0, Lcom/yandex/metrica/impl/bg$d;->a:Lcom/yandex/metrica/impl/h;

    return-object p0
.end method


# virtual methods
.method a()Lcom/yandex/metrica/impl/bc;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/yandex/metrica/impl/bg$d;->b:Lcom/yandex/metrica/impl/bc;

    return-object v0
.end method

.method a(Lcom/yandex/metrica/impl/bg$c;)Lcom/yandex/metrica/impl/bg$d;
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/yandex/metrica/impl/bg$d;->d:Lcom/yandex/metrica/impl/bg$c;

    return-object p0
.end method

.method a(Z)Lcom/yandex/metrica/impl/bg$d;
    .locals 0

    .line 181
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/bg$d;->c:Z

    return-object p0
.end method

.method b()Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 190
    iget-object v0, p0, Lcom/yandex/metrica/impl/bg$d;->d:Lcom/yandex/metrica/impl/bg$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/bg$d;->d:Lcom/yandex/metrica/impl/bg$c;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bg$d;->a:Lcom/yandex/metrica/impl/h;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/bg$c;->a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bg$d;->a:Lcom/yandex/metrica/impl/h;

    return-object v0
.end method

.method c()Z
    .locals 1

    .line 194
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/bg$d;->c:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ReportToSend{mReport="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/bg$d;->a:Lcom/yandex/metrica/impl/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mEnvironment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bg$d;->b:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mCrash="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/yandex/metrica/impl/bg$d;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bg$d;->d:Lcom/yandex/metrica/impl/bg$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
