export const uploadToCloudinary = async (pics) => {
    
    if (pics) {

       
      
      const data = new FormData();
      data.append("file", pics);
      data.append("upload_preset", "khau-galli");
      data.append("cloud_name", "dctsbknib");
  
      const res = await 
      fetch(`https://api.cloudinary.com/v1_1/dctsbknib/image/upload`, {
        method: "post",
        body: data,
      })
        
        const fileData=await res.json();
        console.log("url : ", fileData);
        return fileData.url
  
    } else {
      console.log("error");
    }
  };