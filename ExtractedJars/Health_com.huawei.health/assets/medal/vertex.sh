uniform mat4 uMVPMatrix; //总变换矩阵
uniform mat4 uMMatrix; //变换矩阵
uniform vec3 uLightLocation;	//光源位置
uniform vec3 uCamera;	//摄像机位置
uniform float isBg;//是否是背面

uniform vec4 uLight1Intensity;//光源1 的环境光、漫反射、镜面光强度，以及镜面光粗糙度
uniform vec3 uLight2Location;	//光源位置
uniform vec4 uLight2Intensity;//光源2 的环境光、漫反射、镜面光强度，以及镜面光粗糙度

attribute vec3 aPosition;  //顶点位置
attribute vec3 aNormal;    //顶点法向量
attribute vec2 aTexCoor;    //顶点纹理坐标

uniform vec3 uLightImgLocation;	//投影贴图，虚拟相机的位置
varying vec2 vTextureCoord;
varying vec4 vAmbient;			//用于传递给片元着色器的环境光最终强度
varying vec4 vDiffuse;			//用于传递给片元着色器的散射光最终强度
varying vec4 vSpecular;			//用于传递给片元着色器的镜面光最终强度
varying float vIsBg;
varying vec4 vAmbient2;			//用于传递给片元着色器的环境光最终强度
varying vec4 vDiffuse2;			//用于传递给片元着色器的散射光最终强度
varying vec4 vSpecular2;			//用于传递给片元着色器的镜面光最终强度
varying vec4 vPosition;
varying vec4 vFont1Specular;
varying vec4 vFont2Specular;

void pointLight(				//定位光光照计算的方法
  in vec3 normal,				//法向量
  in vec3 eye,                  //从表面点到摄像机的向量
  inout vec4 ambient,			//环境光最终强度
  inout vec4 diffuse,			//散射光最终强度
  inout vec4 specular,			//镜面光最终强度
  inout vec4 specularFont,      //镜面光最终强度，字体的
  in vec3 lightLocation,		//光源位置
  in vec4 lightAmbient,			//环境光强度
  in vec4 lightDiffuse,			//散射光强度
  in vec4 lightSpecular,		//镜面光强度
  in float shininess,            //粗糙度，越小越光滑
  in float shininessFont
){
  ambient=lightAmbient;			//直接得出环境光的最终强度

  //计算从表面点到光源位置的向量vp
  vec3 vp= normalize(lightLocation-(uMMatrix*vec4(aPosition,1)).xyz);
  vp=normalize(vp);//格式化vp
  vec3 halfVector=normalize(vp+eye);	//求视线与光线的半向量
  //float shininess=10.0;
  float nDotViewPosition=max(0.0,dot(normal,vp)); 	//求法向量与vp的点积与0的最大值
  diffuse=lightDiffuse*nDotViewPosition;				//计算散射光的最终强度
  float nDotViewHalfVector=dot(normal,halfVector);	//法线与半向量的点积
  float powerFactor=max(0.0,pow(nDotViewHalfVector,shininess)); 	//镜面反射光强度因子
  specular=lightSpecular*powerFactor;    			//计算镜面光的最终强度
  specularFont=lightSpecular*max(0.0,pow(nDotViewHalfVector,shininessFont));
}

void main()
{
    gl_Position = uMVPMatrix * vec4(aPosition,1.0); //根据总变换矩阵计算此次绘制此顶点位置

    vTextureCoord.x = aTexCoor.x;//将接收的纹理坐标传递给片元着色器
    vTextureCoord.y = 1.0 - aTexCoor.y;

    vPosition=vec4(aPosition,1.0);

    vec3 normalTarget=aPosition+normalize(aNormal);	//计算变换后的法向量
    vec3 newNormal=(uMMatrix*vec4(normalTarget,1)).xyz-(uMMatrix*vec4(aPosition,1)).xyz;//不知道为什么，这个计算方式和直接使用uMMatrix的逆矩阵的转置矩阵的效果是一样的！
    newNormal=normalize(newNormal); 	//对法向量规格化
    //计算从表面点到摄像机的向量
    vec3 eye= normalize(uCamera-(uMMatrix*vec4(aPosition,1)).xyz);

    vec4 ambientTemp,diffuseTemp,specularTemp,specularFontTemp;	  //用来接收三个通道最终强度的变量
    pointLight( newNormal,eye,
        ambientTemp,diffuseTemp,specularTemp,specularFontTemp,uLightLocation,
        vec4(vec3(uLight1Intensity.x),1.0),vec4(vec3(uLight1Intensity.y),1.0),vec4(vec3(uLight1Intensity.z),1.0),
        uLight1Intensity.w,uLight1Intensity.w/3.0
        );
    vAmbient=ambientTemp; 		//将环境光最终强度传给片元着色器
    vDiffuse=diffuseTemp; 		//将散射光最终强度传给片元着色器
    vSpecular=specularTemp; 		//将镜面光最终强度传给片元着色器
    vFont1Specular=specularFontTemp;


    vec4 ambientTemp2,diffuseTemp2,specularTemp2,specularFontTemp2;	  //用来接收三个通道最终强度的变量
    pointLight( newNormal,eye,
        ambientTemp2,diffuseTemp2,specularTemp2,specularFontTemp2,uLight2Location,
        vec4(vec3(uLight2Intensity.x),1.0),vec4(vec3(uLight2Intensity.y),1.0),vec4(vec3(uLight2Intensity.z),1.0),
        uLight2Intensity.w,uLight2Intensity.w/5.0
        );
    vAmbient2=ambientTemp2; 		//将环境光最终强度传给片元着色器
    vDiffuse2=diffuseTemp2; 		//将散射光最终强度传给片元着色器
    vSpecular2=specularTemp2; 		//将镜面光最终强度传给片元着色器
    vFont2Specular=specularFontTemp2;

    vIsBg=isBg;
}                      