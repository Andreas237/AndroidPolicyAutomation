.class public Lcom/microblink/internal/merchant/AddressSearchRequest;
.super Ljava/lang/Object;


# instance fields
.field private apiKey:Ljava/lang/String;

.field private city:Ljava/lang/String;

.field private location:Lcom/microblink/internal/Location;

.field private radius:I

.field private state:Ljava/lang/String;

.field private street:Ljava/lang/String;

.field private zip:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apiKey(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->apiKey:Ljava/lang/String;

    return-object p0
.end method

.method public apiKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public city(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->city:Ljava/lang/String;

    return-object p0
.end method

.method public city()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->city:Ljava/lang/String;

    return-object v0
.end method

.method public location()Lcom/microblink/internal/Location;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->location:Lcom/microblink/internal/Location;

    return-object v0
.end method

.method public location(Lcom/microblink/internal/Location;)Lcom/microblink/internal/merchant/AddressSearchRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->location:Lcom/microblink/internal/Location;

    return-object p0
.end method

.method public radius()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->radius:I

    return v0
.end method

.method public radius(I)Lcom/microblink/internal/merchant/AddressSearchRequest;
    .locals 0

    iput p1, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->radius:I

    return-object p0
.end method

.method public state(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->state:Ljava/lang/String;

    return-object p0
.end method

.method public state()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->state:Ljava/lang/String;

    return-object v0
.end method

.method public street(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->street:Ljava/lang/String;

    return-object p0
.end method

.method public street()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->street:Ljava/lang/String;

    return-object v0
.end method

.method public zip(Ljava/lang/String;)Lcom/microblink/internal/merchant/AddressSearchRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->zip:Ljava/lang/String;

    return-object p0
.end method

.method public zip()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressSearchRequest;->zip:Ljava/lang/String;

    return-object v0
.end method
