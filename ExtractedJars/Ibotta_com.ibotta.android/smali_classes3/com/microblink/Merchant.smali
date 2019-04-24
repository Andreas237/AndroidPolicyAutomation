.class public Lcom/microblink/Merchant;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/Merchant$Source;
    }
.end annotation


# static fields
.field public static final ABN:Ljava/lang/String; = "ABN"

.field public static final BLINK:Ljava/lang/String; = "BLINK"

.field public static final GOOGLE:Ljava/lang/String; = "GOOGLE"

.field public static final YELP:Ljava/lang/String; = "YELP"


# instance fields
.field private catTypes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private city:Ljava/lang/String;

.field private country:Ljava/lang/String;

.field private googlePlaceId:Ljava/lang/String;

.field private mallName:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private source:Ljava/lang/String;

.field private state:Ljava/lang/String;

.field private storeNumber:I

.field private street:Ljava/lang/String;

.field private yelpId:Ljava/lang/String;

.field private zip:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/Merchant;->storeNumber:I

    return-void
.end method


# virtual methods
.method public catTypes(Ljava/util/ArrayList;)Lcom/microblink/Merchant;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/microblink/Merchant;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/Merchant;->catTypes:Ljava/util/ArrayList;

    return-object p0
.end method

.method public catTypes()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/Merchant;->catTypes:Ljava/util/ArrayList;

    return-object v0
.end method

.method public city(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->city:Ljava/lang/String;

    return-object p0
.end method

.method public city()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->city:Ljava/lang/String;

    return-object v0
.end method

.method public country(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->country:Ljava/lang/String;

    return-object p0
.end method

.method public country()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->country:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_18

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_a

    :cond_1
    check-cast p1, Lcom/microblink/Merchant;

    iget v2, p0, Lcom/microblink/Merchant;->storeNumber:I

    iget v3, p1, Lcom/microblink/Merchant;->storeNumber:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcom/microblink/Merchant;->name:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v3, p1, Lcom/microblink/Merchant;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_3
    iget-object v2, p1, Lcom/microblink/Merchant;->name:Ljava/lang/String;

    if-eqz v2, :cond_4

    :goto_0
    return v1

    :cond_4
    iget-object v2, p0, Lcom/microblink/Merchant;->street:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v3, p1, Lcom/microblink/Merchant;->street:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_5
    iget-object v2, p1, Lcom/microblink/Merchant;->street:Ljava/lang/String;

    if-eqz v2, :cond_6

    :goto_1
    return v1

    :cond_6
    iget-object v2, p0, Lcom/microblink/Merchant;->city:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object v3, p1, Lcom/microblink/Merchant;->city:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_7
    iget-object v2, p1, Lcom/microblink/Merchant;->city:Ljava/lang/String;

    if-eqz v2, :cond_8

    :goto_2
    return v1

    :cond_8
    iget-object v2, p0, Lcom/microblink/Merchant;->state:Ljava/lang/String;

    if-eqz v2, :cond_9

    iget-object v3, p1, Lcom/microblink/Merchant;->state:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_3

    :cond_9
    iget-object v2, p1, Lcom/microblink/Merchant;->state:Ljava/lang/String;

    if-eqz v2, :cond_a

    :goto_3
    return v1

    :cond_a
    iget-object v2, p0, Lcom/microblink/Merchant;->zip:Ljava/lang/String;

    if-eqz v2, :cond_b

    iget-object v3, p1, Lcom/microblink/Merchant;->zip:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_4

    :cond_b
    iget-object v2, p1, Lcom/microblink/Merchant;->zip:Ljava/lang/String;

    if-eqz v2, :cond_c

    :goto_4
    return v1

    :cond_c
    iget-object v2, p0, Lcom/microblink/Merchant;->country:Ljava/lang/String;

    if-eqz v2, :cond_d

    iget-object v3, p1, Lcom/microblink/Merchant;->country:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_5

    :cond_d
    iget-object v2, p1, Lcom/microblink/Merchant;->country:Ljava/lang/String;

    if-eqz v2, :cond_e

    :goto_5
    return v1

    :cond_e
    iget-object v2, p0, Lcom/microblink/Merchant;->catTypes:Ljava/util/ArrayList;

    if-eqz v2, :cond_f

    iget-object v3, p1, Lcom/microblink/Merchant;->catTypes:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_6

    :cond_f
    iget-object v2, p1, Lcom/microblink/Merchant;->catTypes:Ljava/util/ArrayList;

    if-eqz v2, :cond_10

    :goto_6
    return v1

    :cond_10
    iget-object v2, p0, Lcom/microblink/Merchant;->mallName:Ljava/lang/String;

    if-eqz v2, :cond_11

    iget-object v3, p1, Lcom/microblink/Merchant;->mallName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_7

    :cond_11
    iget-object v2, p1, Lcom/microblink/Merchant;->mallName:Ljava/lang/String;

    if-eqz v2, :cond_12

    :goto_7
    return v1

    :cond_12
    iget-object v2, p0, Lcom/microblink/Merchant;->yelpId:Ljava/lang/String;

    if-eqz v2, :cond_13

    iget-object v3, p1, Lcom/microblink/Merchant;->yelpId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_8

    :cond_13
    iget-object v2, p1, Lcom/microblink/Merchant;->yelpId:Ljava/lang/String;

    if-eqz v2, :cond_14

    :goto_8
    return v1

    :cond_14
    iget-object v2, p0, Lcom/microblink/Merchant;->googlePlaceId:Ljava/lang/String;

    if-eqz v2, :cond_15

    iget-object v3, p1, Lcom/microblink/Merchant;->googlePlaceId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_9

    :cond_15
    iget-object v2, p1, Lcom/microblink/Merchant;->googlePlaceId:Ljava/lang/String;

    if-eqz v2, :cond_16

    :goto_9
    return v1

    :cond_16
    iget-object v2, p0, Lcom/microblink/Merchant;->source:Ljava/lang/String;

    if-eqz v2, :cond_17

    iget-object p1, p1, Lcom/microblink/Merchant;->source:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_17
    iget-object p1, p1, Lcom/microblink/Merchant;->source:Ljava/lang/String;

    if-nez p1, :cond_18

    return v0

    :cond_18
    :goto_a
    return v1
.end method

.method public googlePlaceId(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->googlePlaceId:Ljava/lang/String;

    return-object p0
.end method

.method public googlePlaceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->googlePlaceId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/microblink/Merchant;->name:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->street:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->city:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->state:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->zip:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->country:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/microblink/Merchant;->storeNumber:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->catTypes:Ljava/util/ArrayList;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/util/ArrayList;->hashCode()I

    move-result v2

    goto :goto_6

    :cond_6
    const/4 v2, 0x0

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->mallName:Ljava/lang/String;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->yelpId:Ljava/lang/String;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->googlePlaceId:Ljava/lang/String;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_9

    :cond_9
    const/4 v2, 0x0

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Merchant;->source:Ljava/lang/String;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_a
    add-int/2addr v0, v1

    return v0
.end method

.method public mallName(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->mallName:Ljava/lang/String;

    return-object p0
.end method

.method public mallName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->mallName:Ljava/lang/String;

    return-object v0
.end method

.method public name(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->name:Ljava/lang/String;

    return-object p0
.end method

.method public name()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->name:Ljava/lang/String;

    return-object v0
.end method

.method public source(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->source:Ljava/lang/String;

    return-object p0
.end method

.method public source()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->source:Ljava/lang/String;

    return-object v0
.end method

.method public state(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->state:Ljava/lang/String;

    return-object p0
.end method

.method public state()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->state:Ljava/lang/String;

    return-object v0
.end method

.method public storeNumber()I
    .locals 1

    iget v0, p0, Lcom/microblink/Merchant;->storeNumber:I

    return v0
.end method

.method public storeNumber(I)Lcom/microblink/Merchant;
    .locals 0

    iput p1, p0, Lcom/microblink/Merchant;->storeNumber:I

    return-object p0
.end method

.method public street(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->street:Ljava/lang/String;

    return-object p0
.end method

.method public street()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->street:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Merchant{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/Merchant;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", street=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->street:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", city=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->city:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", state=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->state:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", zip=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->zip:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", country=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->country:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeNumber="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/Merchant;->storeNumber:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", catTypes="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->catTypes:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", mallName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->mallName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", yelpId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->yelpId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", googlePlaceId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->googlePlaceId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", source=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Merchant;->source:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public yelpId(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->yelpId:Ljava/lang/String;

    return-object p0
.end method

.method public yelpId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->yelpId:Ljava/lang/String;

    return-object v0
.end method

.method public zip(Ljava/lang/String;)Lcom/microblink/Merchant;
    .locals 0

    iput-object p1, p0, Lcom/microblink/Merchant;->zip:Ljava/lang/String;

    return-object p0
.end method

.method public zip()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Merchant;->zip:Ljava/lang/String;

    return-object v0
.end method
