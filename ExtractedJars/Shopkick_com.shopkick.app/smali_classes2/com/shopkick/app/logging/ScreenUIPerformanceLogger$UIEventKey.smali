.class public Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;
.super Ljava/lang/Object;
.source "ScreenUIPerformanceLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UIEventKey"
.end annotation


# instance fields
.field private action:Ljava/lang/Integer;

.field private originElement:Ljava/lang/Integer;

.field private originElementId:Ljava/lang/String;

.field private screen:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->screen:Ljava/lang/Integer;

    .line 31
    iput-object p2, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->action:Ljava/lang/Integer;

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElement:Ljava/lang/Integer;

    .line 33
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElementId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->screen:Ljava/lang/Integer;

    .line 38
    iput-object p2, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->action:Ljava/lang/Integer;

    .line 39
    iput-object p3, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElement:Ljava/lang/Integer;

    const/4 p1, 0x0

    .line 40
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElementId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->screen:Ljava/lang/Integer;

    .line 24
    iput-object p2, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElement:Ljava/lang/Integer;

    .line 25
    iput-object p3, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElementId:Ljava/lang/String;

    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->action:Ljava/lang/Integer;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;)Ljava/lang/Integer;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->screen:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;)Ljava/lang/Integer;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElement:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;)Ljava/lang/Integer;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->action:Ljava/lang/Integer;

    return-object p0
.end method

.method private fieldsMatch(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-nez p1, :cond_1

    if-nez p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 46
    :cond_0
    instance-of v1, p1, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 48
    :cond_1
    check-cast p1, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;

    .line 49
    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->screen:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->screen:Ljava/lang/Integer;

    invoke-direct {p0, v1, v3}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->fieldsMatch(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElement:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElement:Ljava/lang/Integer;

    invoke-direct {p0, v1, v3}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->fieldsMatch(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElementId:Ljava/lang/String;

    iget-object v3, p1, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElementId:Ljava/lang/String;

    .line 50
    invoke-direct {p0, v1, v3}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->fieldsMatch(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->action:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->action:Ljava/lang/Integer;

    .line 51
    invoke-direct {p0, v1, p1}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->fieldsMatch(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->screen:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x103

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x25

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElement:Ljava/lang/Integer;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x25

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElementId:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x25

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->action:Ljava/lang/Integer;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UIEventKey(screen: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->screen:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", action: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->action:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", originElement: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElement:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", originElementId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger$UIEventKey;->originElementId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
